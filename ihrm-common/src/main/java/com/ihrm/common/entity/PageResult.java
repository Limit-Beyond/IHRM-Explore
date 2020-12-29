package com.ihrm.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @title: PageResult
 * @Author Tan
 * @Date: 2020/12/29 23:24
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {

    private Long total;

    private List<T> rows;
}
