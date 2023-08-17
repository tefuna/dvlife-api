DROP TABLE IF EXISTS dvl.expenses CASCADE;

CREATE TABLE dvl.expenses (
    expense_id SERIAL,
    expense_date DATE,
    accounting_item_id INTEGER,
    description VARCHAR(200),
    amount NUMERIC(10),
    remarks VARCHAR(1000),
    CONSTRAINT expenses_pk PRIMARY KEY (expense_id)
);

COMMENT ON TABLE dvl.expenses IS '支出';

COMMENT ON COLUMN dvl.expenses.expense_id IS '支出ID';

COMMENT ON COLUMN dvl.expenses.expense_date IS '支出日';

COMMENT ON COLUMN dvl.expenses.accounting_item_id IS '勘定科目ID';

COMMENT ON COLUMN dvl.expenses.description IS '内容';

COMMENT ON COLUMN dvl.expenses.amount IS '金額';

COMMENT ON COLUMN dvl.expenses.remarks IS '備考';