package com.yao.springConfig.handler;

import java.lang.reflect.Method;

/**
 * @author yaojian
 * @date 2020/5/14 22:27
 */
public interface MyInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
