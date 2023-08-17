package jp.tefuna.dvlife.presentation;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorResponse {

    private String title;

    private String detail;

    private HttpStatus status;

    private String type;

    private String instance;

    private Object additions;

}
