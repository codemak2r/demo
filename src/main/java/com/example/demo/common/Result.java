package com.example.demo.common;

import com.example.demo.common.enums.Response;

/**
 * @author: zw.wen
 */
public class Result<T> {
    private int status;
    private String message;
    private T data;

    public Result(){}

    public Result(int status){
        this.status = status;
    }

    public Result(int status, String msg) {
        this(status);
        this.message = msg;
    }

    public Result(int status, String msg, T data) {
        this(status, msg);
        this.data = data;
    }

    public static Result success(){
        return new Result(Response.SUCCESS.getStatus(), Response.SUCCESS.getMsg());
    }

    public static<T> Result success(T data){
        return new Result(Response.SUCCESS.getStatus(), Response.SUCCESS.getMsg(), data);
    }

    public static Result fail(){
        return new Result(Response.FAIL.getStatus(), Response.FAIL.getMsg());
    }

    public static<T> Result fail(T data){
        return new Result(Response.FAIL.getStatus(), Response.FAIL.getMsg(), data);
    }

}
