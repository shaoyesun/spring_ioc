package com.ioc.cycle;

import com.ioc.load.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring bean生命周期测试
 */
public class Model {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User) ac.getBean("user");
        user.sayHi();
    }
}
