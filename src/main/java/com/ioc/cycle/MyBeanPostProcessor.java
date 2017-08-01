package com.ioc.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 后置处理器
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("后置处理器：MyBeanPostProcessor postProcessBeforeInitialization " + o + " " + s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("后置处理器：MyBeanPostProcessor postProcessAfterInitialization " + o + " " + s);
        return o;
    }
}
