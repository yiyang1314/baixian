package com.baixian.vo;

import java.io.Serializable;

public class TEmp implements Serializable{
    private Integer id;

    private String username;

    private String password;

    private String sex;

    private String dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

	@Override
	public String toString() {
		return "TEmp [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", dept="
				+ dept + "]";
	}
    
    
    
}