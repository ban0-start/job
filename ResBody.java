package com.ht.manage.common.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * 自定义响应结构
 */
public class ResBody implements Serializable {

    // 响应业务状态
    private Integer code;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public ResBody(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String toJson() {
        return JSON.toJSONString(this);
    }

    public static ResBody build(Integer code, String msg, Object data) {
        return new ResBody(code, msg, data);
    }

    public static ResBody ok(Object data) {
        return new ResBody(data);
    }

    public static ResBody ok() {
        return build(ResCode.success);
    }

    public ResBody() {

    }

    public static ResBody build(Integer code, String msg) {
        return new ResBody(code, msg, null);
    }

    public ResBody(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResBody(Object data) {
        this.code = ResCode.success.code();
        this.msg = ResCode.success.msg();
        this.data = data;
    }

    /*public Boolean isOK() {
        return this.code == ResCode.success.code();
    }*/

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResBody build(ResCode code) {
        return new ResBody(code.code(), code.msg(), null);
    }

    public static ResBody build(Object data) {
        return new ResBody(ResCode.success.code(), ResCode.success.msg(), data);
    }

    public static ResBody build(ResCode code, Object data) {
        return new ResBody(code.code(), code.msg(), data);
    }

    public static ResBody failed() {
        return new ResBody(ResCode.failed.code(), ResCode.failed.msg());
    }
    /*public ResBody uuCode(ResCode success) {
        this.code = success.code();
        this.msg = success.msg();
        return this;
    }*/
}
