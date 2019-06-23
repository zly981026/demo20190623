package com.example.demo.serivce;

import com.example.demo.bean.UserBean;

import java.util.List;

public interface UserService {
    UserBean save(UserBean userBean);

    void remove(Long id);

    UserBean findByLoginName(String loginName);

    List<UserBean> list();
}
