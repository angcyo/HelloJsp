package com.angcyo.beans;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by angcyo on 2016-02-27 20:12.
 */
public class UserBean extends ActionSupport{
    private String name;
    private String pass;

    @Override
    public String execute() {
        if (name.contains("angcyo")) {
            return "success";
        } else {
            return "failed";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
