package com.yao.springConfig.dao;

/**
 * @author yaojian
 * @date 2020/5/14 22:06
 */
public class VipUserDao implements UserDao{
    @Override
    public void playGame() {
        System.out.println("我要开始玩游戏了！");
    }
}
