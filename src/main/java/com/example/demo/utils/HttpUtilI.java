package com.example.demo.utils;


import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * @author: zw.wen
 */
public class HttpUtilI {

    /**
     * get 简单请求
     *
     * @param url
     * @param headers
     * @return
     */
    public static Response get(String url, Map<String, ?> headers) {
        Response r = given().headers(headers).when().get(url).then().extract().response();
        return r;
    }

    /**
     * get 带参数的请求
     *
     * @param url
     * @param headers
     * @param queryParams
     * @return
     */
    public static Response get(String url, Map<String, ?> headers, Map<String, ?> queryParams) {
        Response r = given().headers(headers).queryParams(queryParams).when().get(url).then().extract().response();
        return r;
    }

    /**
     * get 可变路径参数的请求
     *
     * @param url
     * @param headers
     * @param queryParams
     * @return
     */
    public static Response getByPath(String url, Map<String, ?> headers, Map<String, ?> queryParams) {
        Response r = given().headers(headers).pathParams(queryParams).when().get(url).then().extract().response();
        return r;
    }

    /**
     * post 请求
     *
     * @param url
     * @param headers
     * @param json
     * @return
     */
    public static Response post(String url, Map<String, ?> headers, String json) {
        Response r = given().headers(headers).body(json).when().post(url).then().extract().response();
        return r;
    }

    /**
     * post 请求， 带 queryParams
     *
     * @param url
     * @param headers
     * @param queryParams
     * @param json
     * @return
     */
    public static Response post(String url, Map<String, ?> headers, Map<String, ?> queryParams, String json) {
        Response r = given().headers(headers).queryParams(queryParams).body(json).when().post(url).then().extract().response();
        return r;
    }


    /**
     * delete 简单请求
     *
     * @param url
     * @param headers
     * @return
     */
    public static Response delete(String url, Map<String, ?> headers) {
        Response r = given().headers(headers).when().delete(url).then().extract().response();
        return r;
    }

    /**
     * delete 带参数的请求
     *
     * @param url
     * @param headers
     * @param queryParams
     * @return
     */
    public static Response delete(String url, Map<String, ?> headers, Map<String, ?> queryParams) {
        Response r = given().headers(headers).queryParams(queryParams).when().delete(url).then().extract().response();
        return r;
    }

    /**
     * delete 可变路径参数的请求
     *
     * @param url
     * @param headers
     * @param queryParams
     * @return
     */
    public static Response deleteByPath(String url, Map<String, ?> headers, Map<String, ?> queryParams) {
        Response r = given().headers(headers).pathParams(queryParams).when().delete(url).then().extract().response();
        return r;
    }

    /**
     * put 请求
     *
     * @param url
     * @param headers
     * @param json
     * @return
     */
    public static Response put(String url, Map<String, ?> headers, String json) {
        Response r = given().headers(headers).body(json).when().put(url).then().extract().response();
        return r;
    }
}
