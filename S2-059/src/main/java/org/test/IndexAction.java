package org.test;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction  extends ActionSupport {

    private String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String execute(){
        System.out.println(id);
        return SUCCESS;
    }
}
