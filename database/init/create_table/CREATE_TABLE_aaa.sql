DROP TABLE IF EXISTS dvl.aaa CASCADE;
CREATE TABLE dvl.aaa (
    id CHAR(10),
    CONSTRAINT aaa_pk PRIMARY KEY (id)
);

COMMENT ON TABLE dvl.aaa IS 'びび';
COMMENT ON COLUMN dvl.aaa.id IS 'あいでぃー';
