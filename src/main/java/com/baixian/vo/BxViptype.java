package com.baixian.vo;

import java.io.Serializable;
import java.util.Date;

public class BxViptype  implements Serializable{
    private Integer id;

    private String authenticName;

    private Date createTime;

    private String descrition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthenticName() {
        return authenticName;
    }

    public void setAuthenticName(String authenticName) {
        this.authenticName = authenticName == null ? null : authenticName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition == null ? null : descrition.trim();
    }

	@Override
	public String toString() {
		return "BxViptype [id=" + id + ", authenticName=" + authenticName + ", createTime=" + createTime
				+ ", descrition=" + descrition + "]";
	}
    
    
    
}