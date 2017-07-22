package com.ioc.load;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 *  @加载方式 spring有两种加载配置文件的方式ApplicationContext和BeanFactory
 *  @区别 ApplicationContext在容器启动就会实例化scope为singleton的bean，而BeanFactory不会，在应用使用时才创建
 */
public class Model {
    public static void main(String[] args) {

        //上下文加载，从类路径加载
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //上下文加载，从文件系统加载
        //ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\software\\workspace\\IOC\\src\\main\\resources\\applicationContext.xml");

        //上下文加载，从web系统加载，默认配置文件路径及名称/WEB-INF/applicationContext.xml，web项目启动会自动加载
        //ApplicationContext ac = new XmlWebApplicationContext();

        //通过工厂获取，已弃用，不再多说
        //BeanFactory bf = new XmlBeanFactory((Resource) new ClassPathXmlApplicationContext("beans.xml"));
    }
}
