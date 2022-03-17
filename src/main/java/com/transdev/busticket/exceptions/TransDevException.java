package com.transdev.busticket.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TransDevException  extends Exception{

    public TransDevException(String message) {
        super(message);
    }
}
