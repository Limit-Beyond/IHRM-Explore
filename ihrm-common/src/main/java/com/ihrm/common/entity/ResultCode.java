package com.ihrm.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @title: ResultCode
 * @Author Tan
 * @Date: 2020/12/29 23:07
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

    SUCCESS(true, 10000, "操作成功!"),
    FAIL(false, 10001, "操作失败"),
    UNAUTHENTICATED(false, 10002, "暂未登录"),
    UNAUTHORISE(false, 10003, "权限不足"),
    SERVER_ERROR(false, 99999, "抱歉，系统繁忙，请稍后重试");

    public boolean success;

    public Integer code;

    public String message;

}
