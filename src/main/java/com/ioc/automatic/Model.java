package com.ioc.automatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ spring自动装配，实现bean间依赖关系的建立
 * @ 1、byName 据属性名称自动装配，如果一个bean的名称和其他bean属性的名称是一样的，将会自装配它。
 * @ 2、byType 按数据类型自动装配。如果一个bean的数据类型是用其它bean属性的数据类型，兼容并自动装配它。
 * @ 3、constructor 在构造函数参数的byType方式。
 * @ 4、autodetect 如果找到默认的构造函数，使用“自动装配用构造”; 否则，使用“按类型自动装配”。【在Spring3.0以后的版本被废弃，已经不再合法了】
 * @ 5、no 缺省情况下，自动配置是通过“ref”属性手动设定
 *
 * @ 开发中通过@Autowired注解实现
 */
public class Model {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("automatic.xml");
        Teacher t = (Teacher) ac.getBean("teacher");
        String name = t.getStudent().getName();
        System.out.println(name);
    }
}
