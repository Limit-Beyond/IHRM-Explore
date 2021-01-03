package com.ihrm.common.exception;

import com.ihrm.common.entity.ResultCode;
import lombok.Getter;

/**
 * @title: CommonException
 * @Author Tan
 * @Date: 2020/12/30 22:51
 * @Version 1.0
 */
@Getter
public class CommonException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private ResultCode code = ResultCode.SERVER_ERROR;

    public CommonException() {
    }

    public CommonException(ResultCode code) {
        this.code = code;
    }

}

