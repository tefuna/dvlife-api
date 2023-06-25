package jp.tkgss.dvlife.api;

import lombok.Builder;
import lombok.Getter;

/**
 * aaa.
 *
 * @since 1.0.0
 * @author tefuna
 */
@Builder()
public class Aaa {

    /** aaa. */
    public static final String AAA = "aaa";

    @Getter()
    private String test;

    /**
     * aaa.
     *
     * @param aaa aaa
     * @return aa
     */
    public String hello(final String aaa) {
        System.out.println();
        return aaa;
    }
}
