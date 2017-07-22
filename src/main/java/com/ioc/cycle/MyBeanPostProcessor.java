package com.ioc.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Administrator on 2017/7/22.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("MyBeanPostProcessor postProcessBeforeInitialization " + o + " " + s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("MyBeanPostProcessor postProcessAfterInitialization " + o + " " + s);
        return o;
    }
}
