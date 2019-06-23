package com.example.demo.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_user", uniqueConstraints = {@UniqueConstraint(columnNames = {"loginName"})})
public class UserBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String realName;
    private String loginName;
    private String password;

    public UserBean() {
    }

    public UserBean(String realName, String loginName, String password) {
        this.realName = realName;
        this.loginName = loginName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
