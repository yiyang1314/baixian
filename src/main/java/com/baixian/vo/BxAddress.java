package com.baixian.vo;

import java.io.Serializable;

public class BxAddress  implements Serializable{
    private Integer id;

    private String province;

    private String city;

    private String are;

    private String address;

    private Integer defaultStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAre() {
        return are;
    }

    public void setAre(String are) {
        this.are = are == null ? null : are.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

	@Override
	public String toString() {
		return "BxAddress [id=" + id + ", province=" + province + ", city=" + city + ", are=" + are + ", address="
				+ address + ", defaultStatus=" + defaultStatus + "]";
	}
    
    
}