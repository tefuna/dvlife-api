package jp.tefuna.dvlife.domain.code;

import lombok.Getter;

@Getter
public enum RateOrigin implements ICode {

    GENERAL("GEN", "aaa"), REPORT("REP", "aaa"), RECEIPT_BASE("REP", "aaa"),;

    RateOrigin(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;

}
