package com.yip.aop;

/**
 * @author Vincent-Yip
 * @date 2019/8/13 20:05
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
