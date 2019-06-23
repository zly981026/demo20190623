package com.example.demo.controller;

import com.example.demo.bean.UserBean;
import com.example.demo.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 曾令宇
 * @since 2019年06月20日 16:49
 */
@RestController
@RequestMapping("/userService")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("signIn")
    public Map<String, Object> signIn(String loginName, String password) {
        Map<String, Object> result = new HashMap<>(0);
        if (null != loginName && null != password) {
            UserBean userBean = userService.findByLoginName(loginName);
            if (null != userBean && password.equals(userBean.getPassword())) {
                result.put("retCode", "000");
                result.put("userProfile", userBean.toString());
                result.put("msg", "登陆成功");
            } else {
                result.put("retCode", "001");
                result.put("msg", "登陆失败");
            }
        } else {

            result.put("retCode", "002");
            result.put("msg", "登陆失败");
        }
        return result;
    }

    @PostMapping("signUp")
    public Map<String, Object> signUp(String loginName, String password, String realName) {
        Map<String, Object> result = new HashMap<>(0);
        if (null != loginName && null != password && null != realName) {
            UserBean userBean = new UserBean(realName, loginName, password);
            userBean = userService.save(userBean);
            if (null != userBean.getId()) {
                result.put("retCode", "000");
                result.put("userProfile", userBean);
                result.put("msg", "注册成功");
            } else {
                result.put("retCode", "001");
                result.put("msg", "注册失败");
            }
        } else {
            result.put("retCode", "002");
            result.put("msg", "注册失败");
        }
        return result;
    }
}
