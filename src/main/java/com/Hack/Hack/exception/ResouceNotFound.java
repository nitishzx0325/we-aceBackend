package com.Hack.Hack.exception;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResouceNotFound extends RuntimeException{

    private static final long serialVersionUID=1L;
    public ResouceNotFound(String message){
        super(message);
    }
}
