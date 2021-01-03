package com.ihrm.dao;

import com.ihrm.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @title: 企业数据访问接口
 * @Author Tan
 * @Date: 2020/12/30 22:07
 * @Version 1.0
 */
public interface CompanyDao extends JpaRepository<Company, String>, JpaSpecificationExecutor<Company> {


}
