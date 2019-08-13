package com.yip.ioc;

import com.yip.ioc.bean.Car;
import com.yip.ioc.bean.Wheel;
import org.junit.Test;

/**
 * @author Vincent-Yip
 * @date 2019/8/13 19:03
 */
public class SimpleIOCTest {

    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }

}
