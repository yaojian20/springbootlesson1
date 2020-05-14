package com.yao.springConfig.dao;

import org.apache.catalina.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yaojian
 * @date 2020/5/14 22:09
 */
public class UserProxyDao implements InvocationHandler {

    private UserDao target;



    public Object getInstance(UserDao target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我要准备开始玩游戏了");
        System.out.println(proxy.getClass());

        method.invoke(target,args);
        System.out.println("游戏结束！");
        return null;
    }
}
