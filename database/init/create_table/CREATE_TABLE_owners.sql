DROP TABLE IF EXISTS dvl.owners CASCADE;

CREATE TABLE dvl.owners (
    owner_id INTEGER,
    owner_name VARCHAR(100),
    CONSTRAINT owners_pk PRIMARY KEY (owner_id)
);

COMMENT ON TABLE dvl.owners IS '所有者';

COMMENT ON COLUMN dvl.owners.owner_id IS '所有者ID';

COMMENT ON COLUMN dvl.owners.owner_name IS '所有者名';