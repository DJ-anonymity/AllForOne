package com.pojo;

import lombok.Data;

@Data
public class MResponseBody<T> {
    private int status;
    private T data;
    private String msg;}
