package com.ioc.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean后处理器
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("bean后处理器,前置处理：MyBeanPostProcessor postProcessBeforeInitialization " + o + " " + s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("bean后处理器,后置处理：MyBeanPostProcessor postProcessAfterInitialization " + o + " " + s);
        return o;
    }
}
