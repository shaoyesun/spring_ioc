package com.ioc.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/8/2.
 */
public class Model {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("factorybean.xml");
        User user = (User) ac.getBean("myFactoryBean");
        System.out.println(user.toString());
        MyFactoryBean myFactoryBean = (MyFactoryBean) ac.getBean("&myFactoryBean");
        System.out.println(myFactoryBean.isSingleton());
    }
}
