package com.dave.the.diver.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
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
