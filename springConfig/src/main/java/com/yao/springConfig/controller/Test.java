package com.yao.springConfig.controller;

import com.yao.springConfig.dao.UserDao;
import com.yao.springConfig.dao.UserProxyDao;
import com.yao.springConfig.dao.VipUserDao;

/**
 * @author yaojian
 * @date 2020/5/14 22:20
 */
public class Test {

    public static void main(String[] args) {
        UserDao userDao = (UserDao)new UserProxyDao().getInstance(new VipUserDao());
        userDao.playGame();
    }
}
