package com.demo_clinic.democlinic.data.response;

public class BaseResponse<T> {
    int code;
    String message;
    T data;
    public BaseResponse (int code , String message , T data) {
        this.code = code;
        this.message = message ;
        this.data = data;
    }
}
