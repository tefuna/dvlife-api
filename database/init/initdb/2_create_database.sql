/** database */
DROP DATABASE IF EXISTS dvldb;
CREATE DATABASE dvldb WITH
    OWNER='dvl_admin'
    ENCODING='UTF8'
    LC_COLLATE='ja_JP.utf8'
    LC_CTYPE='ja_JP.utf8'
    TEMPLATE template0;

REVOKE ALL ON DATABASE dvldb FROM public;
