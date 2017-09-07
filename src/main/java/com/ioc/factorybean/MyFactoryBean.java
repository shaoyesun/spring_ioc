package com.ioc.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Administrator on 2017/8/2.
 */
public class MyFactoryBean implements FactoryBean<User>{

    private User user;

    public User getObject() throws Exception {
        System.out.println("begin user bean");
        User user = new User();
        user.setName("factoryBean");
        user.setAge(12);
        System.out.println("end user bean");
        return user;
    }

    public Class<?> getObjectType() {
        return User.class;
    }

    public boolean isSingleton() {
        return true;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
