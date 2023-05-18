package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private int age;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String execute() throws Exception{
        if (this.username == null || this.password == null) {
            return "failed";
        }

        if (this.username.equals("admin") && this.password.equals("admin")) {
            return "success";
        }

        return "failed";
    }
}
