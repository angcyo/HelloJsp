package com.angcyo.beans;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by angcyo on 2016-02-27 20:12.
 */
public class ModeUserBean extends ActionSupport implements ModelDriven<UserBean>{
    private UserBean userBean = new UserBean();

    @Override
    public String execute() {
        if (userBean.getName().contains("angcyo")) {
            return "success";
        } else {
            return "failed";
        }
    }

    @Override
    public UserBean getModel() {
        return userBean;
    }
}
