package com.angcyo.spring.beans;

import com.angcyo.spring.inter.IInterface;

/**
 * Created by angcyo on 2016-02-22 22:55.
 */
public class HelloChina implements IInterface {
    @Override
    public String sayHello() {
        return "你好!";
    }
}
