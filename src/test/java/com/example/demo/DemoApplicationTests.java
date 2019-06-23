package com.example.demo;

import com.example.demo.dao.UserBeanDao;
import com.example.demo.serivce.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    UserBeanDao userBeanDao;

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        System.out.println(userBeanDao.findByLoginName("qqq"));
    }

    @Test
    public void serviceTest() {
        userService.list();
    }

}
