package com.baixian.vo;

import java.io.Serializable;

public class BxPerson  implements Serializable{
    private Integer id;

    private String realname;

    private String authenId;

    private String authenPic;

    private String contactAddress;

    private String phone;

    private String email;

    private String telphone;

    private Integer auditStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getAuthenId() {
        return authenId;
    }

    public void setAuthenId(String authenId) {
        this.authenId = authenId == null ? null : authenId.trim();
    }

    public String getAuthenPic() {
        return authenPic;
    }

    public void setAuthenPic(String authenPic) {
        this.authenPic = authenPic == null ? null : authenPic.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

	@Override
	public String toString() {
		return "BxPerson [id=" + id + ", realname=" + realname + ", authenId=" + authenId + ", authenPic=" + authenPic
				+ ", contactAddress=" + contactAddress + ", phone=" + phone + ", email=" + email + ", telphone="
				+ telphone + ", auditStatus=" + auditStatus + "]";
	}
    
    
}