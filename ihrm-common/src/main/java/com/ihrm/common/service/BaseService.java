package com.ihrm.common.service;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @title: BaseService
 * @Author Tan
 * @Date: 2021/1/3 11:51
 * @Version 1.0
 */
public class BaseService<T> {
    protected Specification<T> getSpec(String companyId) {
        Specification<T> spect = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cb) {
                //根据企业id查询
                return cb.equal(root.get("companyId").as(String.class), companyId);
            }
        };
        return spect;
    }
}
