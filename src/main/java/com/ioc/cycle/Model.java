package com.ioc.cycle;

import com.ioc.load.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/22.
 */
public class Model {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User) ac.getBean("user");
        user.sayHi();
    }
}
