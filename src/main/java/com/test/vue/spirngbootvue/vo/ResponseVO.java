package com.test.vue.spirngbootvue.vo;

import lombok.Data;

@Data
public class ResponseVO<T> {

    private String message;
    private boolean check = true;
    private T response;
}
