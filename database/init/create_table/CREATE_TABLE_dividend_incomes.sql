DROP TABLE IF EXISTS dvl.dividend_incomes CASCADE;

CREATE TABLE dvl.dividend_incomes (
    div_income_id SERIAL,
    stock_id INTEGER,
    receipt_date TIMESTAMP WITH TIME ZONE,
    receipt_amount NUMERIC(10),
    receipt_amount_f NUMERIC(14, 6),
    div_unit NUMERIC(14, 6),
    quantity INTEGER,
    div_amount NUMERIC(10),
    div_amount_f NUMERIC(14, 6),
    income_tax NUMERIC(10),
    local_tax NUMERIC(10),
    foreign_tax NUMERIC(10),
    foreign_tax_f NUMERIC(14, 6),
    report_rate_id INTEGER,
    receipt_rate_id INTEGER,
    created_at TIMESTAMP WITH TIME ZONE,
    created_by VARCHAR(10),
    CONSTRAINT dividend_incomes_pk PRIMARY KEY (div_income_id)
);

COMMENT ON TABLE dvl.dividend_incomes IS '配当収入';

COMMENT ON COLUMN dvl.dividend_incomes.div_income_id IS '配当収入ID';

COMMENT ON COLUMN dvl.dividend_incomes.stock_id IS '銘柄ID';

COMMENT ON COLUMN dvl.dividend_incomes.receipt_date IS '受取日';

COMMENT ON COLUMN dvl.dividend_incomes.receipt_amount IS '受取金額';

COMMENT ON COLUMN dvl.dividend_incomes.receipt_amount_f IS '受取金額（外貨）';

COMMENT ON COLUMN dvl.dividend_incomes.div_unit IS '1株配当額';

COMMENT ON COLUMN dvl.dividend_incomes.quantity IS '保有数';

COMMENT ON COLUMN dvl.dividend_incomes.div_amount IS '配当金額';

COMMENT ON COLUMN dvl.dividend_incomes.div_amount_f IS '配当金額（外貨）';

COMMENT ON COLUMN dvl.dividend_incomes.income_tax IS '所得税';

COMMENT ON COLUMN dvl.dividend_incomes.local_tax IS '地方税';

COMMENT ON COLUMN dvl.dividend_incomes.foreign_tax IS '外国源泉徴収税額';

COMMENT ON COLUMN dvl.dividend_incomes.foreign_tax_f IS '外国源泉徴収税額（外貨）';

COMMENT ON COLUMN dvl.dividend_incomes.report_rate_id IS '申告レートID';

COMMENT ON COLUMN dvl.dividend_incomes.receipt_rate_id IS '受取基準レートID';

COMMENT ON COLUMN dvl.dividend_incomes.created_at IS '作成日時';

COMMENT ON COLUMN dvl.dividend_incomes.created_by IS '作成者';
