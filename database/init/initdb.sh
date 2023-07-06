#!/bin/sh
set -u

cd "docker-entrypoint-initdb.d/" || exit
###############################################################################
# 1. create role
#
DBUSER=postgres
if ! psql -U ${DBUSER} -f "initdb/1_create_role.sql" -v ON_ERROR_STOP=1; then
    echo "failed in create role."
    exit 1
fi

###############################################################################
# 2. create database
#
if ! psql -U ${DBUSER} -f "initdb/2_create_database.sql" -v ON_ERROR_STOP=1; then
    echo "failed in create database."
    exit 1
fi

###############################################################################
# 3. create schema
#
DBUSER=dvl_admin
DBNAME=dvldb
# shellcheck disable=SC2034
PGPASSWORD=password
if ! psql -U ${DBUSER} -d ${DBNAME} -f "initdb/3_create_schema.sql" -v ON_ERROR_STOP=1; then
    exit 1
fi

###############################################################################
# 4. create objects
#
for file in $(find create_table -type f | grep CREATE_TABLE_); do
    echo "${file}"
    if ! psql -U ${DBUSER} -d ${DBNAME} -f "${file}" -v ON_ERROR_STOP=1; then
        echo "failed in create table: ${file}"
        exit 1
    fi
done

for file in $(find create_sequence -type f | grep CREATE_SEQUENCE_); do
    echo "${file}"
    if ! psql -U ${DBUSER} -d ${DBNAME} -f "${file}" -v ON_ERROR_STOP=1; then
        echo "failed in create sequence: ${file}"
        exit 1
    fi
done

###############################################################################
# 5. grant
#
if ! psql -U ${DBUSER} -d ${DBNAME} -f "initdb/5_grant.sql" -v ON_ERROR_STOP=1; then
    echo "failed in grant."
    exit 1
fi
