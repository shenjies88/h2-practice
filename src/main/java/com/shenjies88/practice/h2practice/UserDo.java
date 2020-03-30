package com.shenjies88.practice.h2practice;

import java.util.Date;

/**
 * @author shenjies88
 * @since 2020/3/30-11:39 PM
 */
public class UserDo {

    private Integer id;

    private String name;

    private Integer age;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
