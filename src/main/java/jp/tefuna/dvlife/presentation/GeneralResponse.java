package jp.tefuna.dvlife.presentation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;

/**
 * GeneralResponse.
 *
 * @author tefuna
 */
@Data
public final class GeneralResponse<T> {

    @JsonUnwrapped
    private T result;

    private List<T> results;

    private ErrorResponse error;
}
