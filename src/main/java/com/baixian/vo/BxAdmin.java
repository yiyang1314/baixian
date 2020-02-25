package com.baixian.vo;

import java.io.Serializable;
import java.util.Date;

public class BxAdmin implements Serializable{
    private Integer id;

    private String adminName;

    private Date loginTime;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

	@Override
	public String toString() {
		return "BxAdmin [id=" + id + ", adminName=" + adminName + ", loginTime=" + loginTime + ", password=" + password
				+ "]";
	}
    
    
    
}