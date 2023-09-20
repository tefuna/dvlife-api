package jp.tefuna.dvlife.domain.code;

import java.util.Arrays;

interface ICode<E extends Enum<E>> {

    String getCode();

    // TODO 再帰ジェネリクスの意味について調べる
    @SuppressWarnings("unchecked")
    default E toEnum() {
        return (E) this;
    }

    static String getNameByCode(String code) {
        return "";
    }

    static <T extends Enum<T>> T fromCode(Class<? extends ICode<T>> clazz, String code) {
        return Arrays.stream(clazz.getEnumConstants())
                .filter(v -> v.getCode().equals(code))
                .map(ICode::toEnum)
                .findFirst()
                .orElse(null);
    }

}
