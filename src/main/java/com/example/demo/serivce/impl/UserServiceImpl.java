package com.example.demo.serivce.impl;

import com.example.demo.bean.UserBean;
import com.example.demo.dao.UserBeanDao;
import com.example.demo.serivce.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserBeanDao userBeanDao;

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserBean save(UserBean userBean) {
        UserBean result = userBeanDao.save(userBean);
        if (null != result.getId()) {
            logger.info("User saved --------------------------->" + result);
        } else {

            logger.error("User save failed --------------------------->" + result);
        }
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(Long id) {
        userBeanDao.delete(userBeanDao.getOne(id));
        logger.info("User removed --------------------------->");
    }

    @Override
    public UserBean findByLoginName(String loginName) {
        UserBean userBean = userBeanDao.findByLoginName(loginName);
        if (null != userBean) {
            logger.info("User find by loginName --------------------------->" + userBean);
        }
        return userBean;
    }

    @Override
    public List<UserBean> list() {

        List<UserBean> userBeanList = userBeanDao.findAll();
        logger.info("<--------------------------- User list --------------------------->");
        userBeanList.forEach(x -> {
            logger.info(x.toString());
        });

        logger.info("<------------------------------ end ------------------------------>");
        return userBeanList;
    }
}
