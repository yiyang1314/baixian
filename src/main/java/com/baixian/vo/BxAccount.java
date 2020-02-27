package com.baixian.vo;

import java.io.Serializable;
import java.util.Date;

public class BxAccount  implements Serializable{
    private Integer id;

    private Integer userid;

    private Integer lockStatus;

    private Integer cardId;

    private String cartName;

    private String openbank;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName == null ? null : cartName.trim();
    }

    public String getOpenbank() {
        return openbank;
    }

    public void setOpenbank(String openbank) {
        this.openbank = openbank == null ? null : openbank.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "BxAccount [id=" + id + ", userid=" + userid + ", lockStatus=" + lockStatus + ", cardId=" + cardId
				+ ", cartName=" + cartName + ", openbank=" + openbank + ", createTime=" + createTime + "]";
	}
    
    
}