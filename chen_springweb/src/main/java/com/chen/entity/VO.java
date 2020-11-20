package com.chen.entity;

import java.util.List;

/**
 * @ClassName VO
 * @Description TODO
 * @Author cyh
 * @Date 2020/11/19 21:21
 */
public class VO {

    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}