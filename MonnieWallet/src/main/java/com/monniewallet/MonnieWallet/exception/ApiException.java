package com.monniewallet.MonnieWallet.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
}
