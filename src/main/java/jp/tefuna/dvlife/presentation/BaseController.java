package jp.tefuna.dvlife.presentation;

import java.util.List;

/**
 * BaseController.
 *
 * @author tefuna
 */
public abstract class BaseController {

    protected <T> GeneralResponse<T> respond(T response) {
        GeneralResponse<T> res = new GeneralResponse<>();
        res.setResult(response);
        return res;
    }

    protected <T> GeneralResponse<T> respond(List<T> responses) {
        GeneralResponse<T> res = new GeneralResponse<>();
        res.setResults(responses);
        return res;
    }

}
