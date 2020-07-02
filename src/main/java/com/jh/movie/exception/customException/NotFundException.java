package com.jh.movie.exception.customException;

public class NotFundException extends RuntimeException {
    private int code;
    private int httpStatusCode=404;
    private String message;

    public NotFundException(int code, String message) {
        this.code = code;
        this.message=message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
