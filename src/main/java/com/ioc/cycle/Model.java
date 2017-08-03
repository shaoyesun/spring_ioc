package com.ioc.cycle;

import com.ioc.load.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring bean生命周期测试
 * @ 1.对象实例化
 * @ 2.设置参数及依赖关系
 * @ 3.如果实现了BeanNameAware接口，则调用setBeanName方法，获取beanName
 * @ 4.如果实现了BeanFactoryAware接口，则调用setBeanFactory方法，获得当前beanFactory
 * @ 5.如果实现了ApplicationContextAware接口，则调用setApplicationContext方法，获得当前ApplicationContext
 * @ 6.如果实现了BeanPostProcessor接口，则调用postProcessBeforeInitialization方法，处理初始化前的逻辑
 * @ 7.如果实现了InitializingBean接口，则调用afterPropertiesSet方法，堆参数进行处理
 * @ 8.如果配置了init-method，则执行自定义初始化方法
 * @ 9.如果实现了BeanPostProcessor接口，则调用postProcessAfterInitialization方法，处理初始化后的逻辑
 * @ 10.使用bean
 * @ 11.如果实现了DisposableBean接口，则调用destroy方法
 * @ 12.如果配置了destroy-method，则执行自定义销毁方法
 */
public class Model {
    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) ac.getBean("user");
        user.sayHi();
        ac.registerShutdownHook();//AbstractApplicationContext的registerShutdownHook方法执行销毁方法
    }
}
