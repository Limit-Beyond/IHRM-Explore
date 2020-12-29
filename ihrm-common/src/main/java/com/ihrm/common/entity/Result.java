package com.ihrm.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @title: Result
 * @Author Tan
 * @Date: 2020/12/29 13:57
 * @Version 1.0
 */
@Data
@AllArgsConstructor
//空数据不显示
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {


    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 状态返回码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;

    public Result(ResultCode resultCode) {
        this.success = resultCode.success;
        this.code = resultCode.code;
        this.message = resultCode.message;
    }


    public Result(ResultCode code, Object data) {
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
        this.data = data;
    }

    public Result(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public static Result Success(){
        return new Result(ResultCode.SUCCESS);
    }


    public static Result Fail(){
        return new Result(ResultCode.FAIL);
    }


    public static Result Error(){
        return new Result(ResultCode.SERVER_ERROR);
    }

}
