DROP TABLE IF EXISTS dvl.stocks CASCADE;

CREATE TABLE dvl.stocks (
    stock_id SERIAL,
    ticker VARCHAR(4),
    stock_name VARCHAR(200),
    stock_abbr_name VARCHAR(200),
    status VARCHAR(1),
    country VARCHAR(2),
    currency VARCHAR(3),
    market_code VARCHAR(6),
    is_etf BOOLEAN,
    sector_1 VARCHAR,
    sector_2 VARCHAR,
    divunit_site_kind VARCHAR(1),
    divunit_referred_url VARCHAR(1000),
    updated_at TIMESTAMP WITH TIME ZONE,
    updated_by VARCHAR(10),
    CONSTRAINT stocks_pk PRIMARY KEY (stock_id)
);

COMMENT ON TABLE dvl.stocks IS '銘柄';

COMMENT ON COLUMN dvl.stocks.stock_id IS '銘柄ID';

COMMENT ON COLUMN dvl.stocks.ticker IS 'ティッカー';

COMMENT ON COLUMN dvl.stocks.stock_name IS '銘柄名';

COMMENT ON COLUMN dvl.stocks.stock_abbr_name IS '銘柄名（略称）';

COMMENT ON COLUMN dvl.stocks.status IS 'ステータス';

COMMENT ON COLUMN dvl.stocks.country IS '国';

COMMENT ON COLUMN dvl.stocks.currency IS '通貨';

COMMENT ON COLUMN dvl.stocks.market_code IS '市場コード';

COMMENT ON COLUMN dvl.stocks.is_etf IS 'ETF区分';

COMMENT ON COLUMN dvl.stocks.sector_1 IS 'セクター分類1';

COMMENT ON COLUMN dvl.stocks.sector_2 IS 'セクター分類2';

COMMENT ON COLUMN dvl.stocks.divunit_site_kind IS '配当単位区分';

COMMENT ON COLUMN dvl.stocks.divunit_referred_url IS '配当単位取得URL';

COMMENT ON COLUMN dvl.stocks.updated_at IS '更新日時';

COMMENT ON COLUMN dvl.stocks.updated_by IS '更新者';