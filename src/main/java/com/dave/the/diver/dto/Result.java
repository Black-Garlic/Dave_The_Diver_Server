package com.dave.the.diver.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Result {

    private boolean success;

    private Object data;

    private String message;

    public Result() {
        this.success = false;
    }

    public void setSuccessResult(
        Object data
    ) {
        this.success = true;
        this.data = data;
    }

    public void setFailResult(
        String message
    ) {
        this.success = false;
        this.message = message;
    }
}
