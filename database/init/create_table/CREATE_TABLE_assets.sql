DROP TABLE IF EXISTS dvl.assets CASCADE;

CREATE TABLE dvl.assets (
    asset_id SERIAL,
    base_date DATE,
    asset_liab_type VARCHAR(4),
    asset_class VARCHAR(4),
    owner_id INTEGER,
    mgmt_company_id INTEGER,
    amount NUMERIC(10),
    remarks VARCHAR(1000),
    CONSTRAINT assets_pk PRIMARY KEY (asset_id)
);

COMMENT ON TABLE dvl.assets IS '資産';

COMMENT ON COLUMN dvl.assets.asset_id IS '資産ID';

COMMENT ON COLUMN dvl.assets.base_date IS '基準年月';

COMMENT ON COLUMN dvl.assets.asset_liab_type IS '資産負債区分';

COMMENT ON COLUMN dvl.assets.asset_class IS '資産クラス';

COMMENT ON COLUMN dvl.assets.owner_id IS '所有者ID';

COMMENT ON COLUMN dvl.assets.mgmt_company_id IS '運用会社ID';

COMMENT ON COLUMN dvl.assets.amount IS '金額';

COMMENT ON COLUMN dvl.assets.remarks IS '備考';