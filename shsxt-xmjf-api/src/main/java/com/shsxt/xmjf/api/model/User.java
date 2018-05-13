package com.shsxt.xmjf.api.model;

import java.io.Serializable;

/**
 * Created by lp on 2018/5/11.
 */
public class User implements Serializable{
    private static final long serialVersionUID = -4513110048563534318L;
    private Integer id;
    private String userName;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
