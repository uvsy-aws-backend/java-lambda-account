package com.universy.account.function.verify.exceptions;

import com.universy.lambda.api.handlers.exceptions.BusinessException;

import java.net.HttpURLConnection;

public class IncorrectCodeException extends BusinessException {

    private static final String ERROR_MESSAGE = "The code sent is incorrect.";

    public IncorrectCodeException() {
        super(ERROR_MESSAGE, HttpURLConnection.HTTP_BAD_REQUEST);
    }
}
