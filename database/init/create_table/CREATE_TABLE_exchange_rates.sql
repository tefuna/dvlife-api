DROP TABLE IF EXISTS dvl.exchange_rates CASCADE;

CREATE TABLE dvl.exchange_rates (
    rate_id SERIAL,
    base_date TIMESTAMP WITH TIME ZONE,
    currency VARCHAR(3),
    rate_origin VARCHAR(3),
    rate NUMERIC(7, 4),
    CONSTRAINT exchange_rates_pk PRIMARY KEY (rate_id)
);

COMMENT ON TABLE dvl.exchange_rates IS '為替レート';

COMMENT ON COLUMN dvl.exchange_rates.rate_id IS 'レートID';

COMMENT ON COLUMN dvl.exchange_rates.base_date IS '基準日';

COMMENT ON COLUMN dvl.exchange_rates.currency IS '通貨コード';

COMMENT ON COLUMN dvl.exchange_rates.rate_origin IS 'レート区分';

COMMENT ON COLUMN dvl.exchange_rates.rate IS 'レート';