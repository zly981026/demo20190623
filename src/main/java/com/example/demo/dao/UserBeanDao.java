package com.example.demo.dao;

import com.example.demo.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author 曾令宇
 * @since 2019年06月20日 15:18
 */
@Repository
public interface UserBeanDao extends JpaRepository<UserBean, Long>, JpaSpecificationExecutor<UserBean> {

    UserBean findByLoginName(String loingName);
}
