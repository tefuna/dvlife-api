DROP TABLE IF EXISTS dvl.bbb CASCADE;
CREATE TABLE dvl.bbb (
    id CHAR(10),
    CONSTRAINT bbb_pk PRIMARY KEY (id)
);

COMMENT ON TABLE dvl.bbb IS 'びび';
COMMENT ON COLUMN dvl.bbb.id IS 'あいでぃー';
