package com.eazybytes.accounts.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistExpection extends RuntimeException{

    public CustomerAlreadyExistExpection(String message){
        super(message);
    }



}
