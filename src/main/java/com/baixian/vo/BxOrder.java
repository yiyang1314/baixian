package com.baixian.vo;

import java.io.Serializable;
import java.util.Date;

public class BxOrder  implements Serializable{
    private Integer id;

    private Integer commId;

    private Integer productId;

    private Integer num;

    private Double total;

    private Integer payStatus;

    private Date createTime;

    private String receiveAddress;

    private String phone;

    private Integer orderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

	@Override
	public String toString() {
		return "BxOrder [id=" + id + ", commId=" + commId + ", productId=" + productId + ", num=" + num + ", total="
				+ total + ", payStatus=" + payStatus + ", createTime=" + createTime + ", receiveAddress="
				+ receiveAddress + ", phone=" + phone + ", orderId=" + orderId + "]";
	}
    
    
    
}