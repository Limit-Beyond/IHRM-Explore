package com.ihrm.common.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @title: BaseController
 * @Author Tan
 * @Date: 2021/1/3 10:59
 * @Version 1.0
 */
public class BaseController {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected String companyId;
    protected String companyName;

    @ModelAttribute
    public void setResAnReq(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        /**
         * 目前使用 companyId = 1
         *         companyName = "传智播客"
         */
        this.companyId = "1";
        this.companyName = "传智播客";
    }
}
