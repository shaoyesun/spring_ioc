package com.ioc.load;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Administrator on 2017/7/22.
 */
public class User implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {
    private String name;
    private int age;

    public User() {
        System.out.println("实例化当前bean：User");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("为当前实例参数设值 name = " + name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //获取当前bean引用，该方法可以给s正在实例化的bean id
    public void setBeanName(String s) {
        System.out.println("获取当前bean引用：BeanNameAware setBeanName bean引用 id = " + s);
    }

    //获取工厂，该方法可以给beanFactory工厂中所有的bean引用
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("获取工厂：BeanFactoryAware setBeanFactory bean工厂 " + beanFactory);
    }

    //获取上下文，返回容器创建时间等信息
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("获取上下文：ApplicationContextAware setApplicationContext " + applicationContext);
    }

    //初始化后处理
    public void afterPropertiesSet() throws Exception {
        name = "after Spring";
        System.out.println("初始化后处理器：InitializingBean afterPropertiesSet");
    }

    //自己定义的初始化方法
    public void myInit() {
        System.out.println("自定义初始化方法：my init");
    }

    //DisposableBean destroy
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy");
    }

    //自定义destroy
    public void myDestroy() {
        System.out.println("自定义销毁方法：my destroy");
    }

    //使用bean
    public void sayHi() {
        System.out.println("使用bean：Hi " + name);
    }
}
