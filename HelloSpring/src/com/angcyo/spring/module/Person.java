package com.angcyo.spring.module;

import com.angcyo.spring.inter.IInterface;

/**
 * Created by angcyo on 2016-02-22 23:01.
 */
public class Person {
    IInterface iInterface;

    public IInterface getiInterface() {
        return iInterface;
    }

    public void setiInterface(IInterface iInterface) {
        this.iInterface = iInterface;
    }

    public void sayHello() {
        System.out.println(iInterface.sayHello());
    }
}
