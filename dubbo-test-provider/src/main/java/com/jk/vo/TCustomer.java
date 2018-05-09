package com.jk.vo;

import java.io.Serializable;

public class TCustomer implements Serializable{

	private static final long serialVersionUID = -885438463519758621L;
	private Integer id;
	private String customerCode;
	private String customer;
	private String phone;
	private String fax;
	private String address;
	private String postCode;
	private String linkman;
	private String linkmanMobile;
	private String customerType;
	private String enterprisePropert;
	private String enterpriseSize;
	private String email;
	@Override
	public String toString() {
		return "TCustomer [id=" + id + ", customerCode=" + customerCode
				+ ", customer=" + customer + ", phone=" + phone + ", fax="
				+ fax + ", address=" + address + ", postCode=" + postCode
				+ ", linkman=" + linkman + ", linkmanMobile=" + linkmanMobile
				+ ", customerType=" + customerType + ", enterprisePropert="
				+ enterprisePropert + ", enterpriseSize=" + enterpriseSize
				+ ", email=" + email + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public String getLinkmanMobile() {
		return linkmanMobile;
	}
	public void setLinkmanMobile(String linkmanMobile) {
		this.linkmanMobile = linkmanMobile;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getEnterprisePropert() {
		return enterprisePropert;
	}
	public void setEnterprisePropert(String enterprisePropert) {
		this.enterprisePropert = enterprisePropert;
	}
	public String getEnterpriseSize() {
		return enterpriseSize;
	}
	public void setEnterpriseSize(String enterpriseSize) {
		this.enterpriseSize = enterpriseSize;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
