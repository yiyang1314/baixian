package com.baixian.vo;

import java.io.Serializable;
import java.util.Date;

public class BxScore  implements Serializable{
    private Integer id;

    private Integer orderId;

    private Integer productId;

    private Integer score;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "BxScore [id=" + id + ", orderId=" + orderId + ", productId=" + productId + ", score=" + score
				+ ", createTime=" + createTime + "]";
	}
    
    
}