package com.angcyo.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by angcyo on 16-02-22-022.
 */
public class RSpring {
    public static void main(String... args) {
        System.out.println("Hello Spring");
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext();
    }
}
