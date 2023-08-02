package jp.tefuna.dvlife.domain.model.stock;

import lombok.Builder;

@Builder
public class Stock {
    private final StockId stockId;
    private final StockName stockName;
}
