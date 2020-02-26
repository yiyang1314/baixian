package com.baixian.vo;

import java.io.Serializable;

public class BxCompany  implements Serializable{
    private Integer id;

    private String companyName;

    private String imageList;

    private String otherList;

    private String corporate;

    private String operator;

    private String operateService;

    private String contact;

    private Integer authenticStatus;

    private Integer addressId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getImageList() {
        return imageList;
    }

    public void setImageList(String imageList) {
        this.imageList = imageList == null ? null : imageList.trim();
    }

    public String getOtherList() {
        return otherList;
    }

    public void setOtherList(String otherList) {
        this.otherList = otherList == null ? null : otherList.trim();
    }

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate == null ? null : corporate.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getOperateService() {
        return operateService;
    }

    public void setOperateService(String operateService) {
        this.operateService = operateService == null ? null : operateService.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public Integer getAuthenticStatus() {
        return authenticStatus;
    }

    public void setAuthenticStatus(Integer authenticStatus) {
        this.authenticStatus = authenticStatus;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}