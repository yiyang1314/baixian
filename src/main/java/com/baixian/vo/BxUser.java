package com.baixian.vo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BxUser  implements Serializable{
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String picPath;

    private String phone;

    private String emaill;

    private String area;

    private Integer addressId;

    private Integer accountId;

    private Integer authenId;

    private Integer productId;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updateTime;
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    //@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date lastloginTime;

    private Integer useStatus;

    private Integer viptypeId;

    private Double score;

    private Double money;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill == null ? null : emaill.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAuthenId() {
        return authenId;
    }

    public void setAuthenId(Integer authenId) {
        this.authenId = authenId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLastloginTime() {
        return lastloginTime;
    }

    public void setLastloginTime(Date lastloginTime) {
        this.lastloginTime = lastloginTime;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public Integer getViptypeId() {
        return viptypeId;
    }

    public void setViptypeId(Integer viptypeId) {
        this.viptypeId = viptypeId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

	@Override
	public String toString() {
		return "BxUser [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", picPath=" + picPath + ", phone=" + phone + ", emaill=" + emaill + ", area=" + area + ", addressId="
				+ addressId + ", accountId=" + accountId + ", authenId=" + authenId + ", productId=" + productId
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", lastloginTime=" + lastloginTime
				+ ", useStatus=" + useStatus + ", viptypeId=" + viptypeId + ", score=" + score + ", money=" + money
				+ "]";
	}
    
    
    
}