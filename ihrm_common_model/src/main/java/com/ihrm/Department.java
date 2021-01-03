package com.ihrm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2021-01-03 12:41:20
 */
@Entity
@Table(name = "co_department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    private static final long serialVersionUID = -24933943038307934L;

    @Id
    private String id;
    /**
    * 企业ID
    */
    private String companyId;
    /**
    * 父级部门ID
    */
    private String parentId;
    /**
    * 部门名称
    */
    private String name;
    /**
    * 部门编码
    */
    private String code;
    /**
    * 部门类别
    */
    private String category;
    /**
    * 负责人ID
    */
    private String managerId;
    /**
    * 城市
    */
    private String city;
    /**
    * 介绍
    */
    private String introduce;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 部门负责人
    */
    private String manager;
}