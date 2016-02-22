package com.angcyo.spring;

import com.angcyo.spring.module.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by angcyo on 16-02-22-022.
 */
public class RSpring {
    public static void main(String... args) {
        System.out.println("Hello Spring");
        try {
            /*两个类,加载的路径不一样哦;*/
            FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("HelloSpring/config/config.xml");
            Person person = (Person) context.getBean("person");
            person.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            /*推荐使用这种方法*/
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            Person person = (Person) context.getBean("person");
            person.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
