package com.baixian.vo;

import java.io.Serializable;
import java.util.Date;

public class BxProduct  implements Serializable{
    private Integer id;

    private String productName;

    private String productAttr;

    private String productSpecical;

    private String grade;

    private String area;

    private Integer num;

    private String sendCity;

    private Double price;

    private Integer commId;

    private Integer auditStatus;

    private Integer existsGoods;

    private String repositoryNead;

    private Integer itemcatId;

    private Date createTime;

    private Date auditTime;

    private String imageList;

    private Integer bandId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr == null ? null : productAttr.trim();
    }

    public String getProductSpecical() {
        return productSpecical;
    }

    public void setProductSpecical(String productSpecical) {
        this.productSpecical = productSpecical == null ? null : productSpecical.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity == null ? null : sendCity.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getExistsGoods() {
        return existsGoods;
    }

    public void setExistsGoods(Integer existsGoods) {
        this.existsGoods = existsGoods;
    }

    public String getRepositoryNead() {
        return repositoryNead;
    }

    public void setRepositoryNead(String repositoryNead) {
        this.repositoryNead = repositoryNead == null ? null : repositoryNead.trim();
    }

    public Integer getItemcatId() {
        return itemcatId;
    }

    public void setItemcatId(Integer itemcatId) {
        this.itemcatId = itemcatId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getImageList() {
        return imageList;
    }

    public void setImageList(String imageList) {
        this.imageList = imageList == null ? null : imageList.trim();
    }

    public Integer getBandId() {
        return bandId;
    }

    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }
}