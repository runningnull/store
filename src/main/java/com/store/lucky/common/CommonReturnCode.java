package com.store.lucky.common;

/**
 * @author: linzj
 * date: 2019/3/12
 * time: 16:54
 * description: No Description
 */
public enum CommonReturnCode {
    //业务失败
    BUSIEXCEPTION("-10001", "业务失败"),
    //技术失败
    TECHNIQUEEXCEPTION("-20001", "技术失败"),
    //json解析失败
    JSON_ERROR("-99002", "json解析失败"),
    //参数错误
    PARAMA_EXCEPTION("-30000", "参数错误"),
    ;
    private String code;
    private String msg;

    CommonReturnCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
