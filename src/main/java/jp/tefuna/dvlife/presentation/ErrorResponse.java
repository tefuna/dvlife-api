package jp.tefuna.dvlife.presentation;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * エラーレスポンス.
 */
@Data
public class ErrorResponse {

    private String type;
    private HttpStatus status;
    private String title;
    private String detail;
    private String instance;
    private Object additions;

}
