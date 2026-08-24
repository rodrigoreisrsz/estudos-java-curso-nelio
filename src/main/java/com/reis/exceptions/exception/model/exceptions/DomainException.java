package com.reis.exceptions.exception.model.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVerisonUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
