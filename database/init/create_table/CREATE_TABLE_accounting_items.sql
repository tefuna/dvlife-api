DROP TABLE IF EXISTS dvl.accounting_items CASCADE;

CREATE TABLE dvl.accounting_items (
    accounting_item_id INTEGER,
    income_or_expense_type VARCHAR(2),
    class1_code VARCHAR(3),
    class1_name VARCHAR(100),
    class2_code VARCHAR(6),
    class2_name VARCHAR(100),
    sort_order INTEGER,
    updated_at TIMESTAMP WITH TIME ZONE,
    updated_by VARCHAR(10),
    CONSTRAINT accounting_items_pk PRIMARY KEY (accounting_item_id)
);

COMMENT ON TABLE dvl.accounting_items IS '勘定科目';

COMMENT ON COLUMN dvl.accounting_items.accounting_item_id IS '勘定科目ID';

COMMENT ON COLUMN dvl.accounting_items.income_or_expense_type IS '収支区分';

COMMENT ON COLUMN dvl.accounting_items.class1_code IS '大分類コード';

COMMENT ON COLUMN dvl.accounting_items.class1_name IS '大分類名';

COMMENT ON COLUMN dvl.accounting_items.class2_code IS '小分類コード';

COMMENT ON COLUMN dvl.accounting_items.class2_name IS '小分類名';

COMMENT ON COLUMN dvl.accounting_items.sort_order IS 'ソート順';

COMMENT ON COLUMN dvl.accounting_items.updated_at IS '更新日時';

COMMENT ON COLUMN dvl.accounting_items.updated_by IS '更新者';