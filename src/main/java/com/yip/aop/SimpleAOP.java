package com.yip.aop;

import java.lang.reflect.Proxy;

/**
 * @author Vincent-Yip
 * @date 2019/8/13 20:03
 */
public class SimpleAOP {

    public static Object getProxy(Object bean, Advice advice){
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }

}
