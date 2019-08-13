package com.yip.aop;

import org.junit.Test;

/**
 * @author Vincent-Yip
 * @date 2019/8/13 20:06
 */
public class SimpleAOPTest {

    @Test
    public void getProxy(){
        MethodInvocation logTask = () -> System.out.println("log task start");
        HelloService helloService = new HelloServiceImpl();
        Advice beforeAdvice = new BeforeAdvice(helloService, logTask);
        HelloService helloServiceProxy = (HelloService) SimpleAOP.getProxy(helloService, beforeAdvice);
        helloServiceProxy.sayHello();
    }

}
