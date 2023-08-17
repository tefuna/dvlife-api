DROP TABLE IF EXISTS dvl.mgmt_companies CASCADE;

CREATE TABLE dvl.mgmt_companies (
    mgmt_company_id INTEGER,
    mgmt_company_class VARCHAR(2),
    status VARCHAR(1),
    bank_code VARCHAR(4),
    branch_code VARCHAR(3),
    swift_code VARCHAR(11),
    company_name VARCHAR(100),
    company_name_kana VARCHAR(100),
    company_name_en VARCHAR(100),
    branch_name VARCHAR(100),
    branch_name_kana VARCHAR(100),
    branch_name_en VARCHAR(100),
    updated_at TIMESTAMP WITH TIME ZONE,
    updated_by VARCHAR(10),
    CONSTRAINT mgmt_companies_pk PRIMARY KEY (mgmt_company_id)
);

COMMENT ON TABLE dvl.mgmt_companies IS '運用会社';

COMMENT ON COLUMN dvl.mgmt_companies.mgmt_company_id IS '運用会社ID';

COMMENT ON COLUMN dvl.mgmt_companies.mgmt_company_class IS '運用会社区分';

COMMENT ON COLUMN dvl.mgmt_companies.status IS 'ステータス';

COMMENT ON COLUMN dvl.mgmt_companies.bank_code IS '金融機関コード';

COMMENT ON COLUMN dvl.mgmt_companies.branch_code IS '支店コード';

COMMENT ON COLUMN dvl.mgmt_companies.swift_code IS 'SWIFTコード';

COMMENT ON COLUMN dvl.mgmt_companies.company_name IS '会社名';

COMMENT ON COLUMN dvl.mgmt_companies.company_name_kana IS '会社名カナ';

COMMENT ON COLUMN dvl.mgmt_companies.company_name_en IS '会社名EN';

COMMENT ON COLUMN dvl.mgmt_companies.branch_name IS '支店名';

COMMENT ON COLUMN dvl.mgmt_companies.branch_name_kana IS '支店名カナ';

COMMENT ON COLUMN dvl.mgmt_companies.branch_name_en IS '支店名EN';

COMMENT ON COLUMN dvl.mgmt_companies.updated_at IS '更新日時';

COMMENT ON COLUMN dvl.mgmt_companies.updated_by IS '更新者';