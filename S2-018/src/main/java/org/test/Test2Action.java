package org.test;

import com.opensymphony.xwork2.ActionSupport;

public class Test2Action extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return "success";
    }
}
