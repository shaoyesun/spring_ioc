package com.ioc.scope;

import com.ioc.load.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @五中scope
 * @ 1.singleton 整个spring容器只存在一个实例，此时bean生命周期由spring容器管理
 * @ 2.prototype 每次调用都会创建一个实例，此时bean创建后则不由spring容器管理
 * @ 3.request 每次request请求创建一个实例
 * @ 4.session 每次会话创建一个实例
 * @ 5.global session
 */
public class Model {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user1 = (User) ac.getBean("user");
        User user2 = (User) ac.getBean("user");
        System.out.println(user1 == user2);//当scope为singleton时为true，当scope为prototype时为false
    }
}
