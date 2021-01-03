package com.ihrm.common.exception;

import com.ihrm.common.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @title: BaseExceptionHandler
 * @Author Tan
 * @Date: 2020/12/30 22:54
 * @Version 1.0
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result error(HttpServletRequest request, HttpServletResponse response,
                        Exception e) {
        e.printStackTrace();
        if (e.getClass() == CommonException.class) {
            CommonException ce = (CommonException) e;
            return new Result(ce.getCode());
        } else {
            return Result.Error();
        }
    }
}
