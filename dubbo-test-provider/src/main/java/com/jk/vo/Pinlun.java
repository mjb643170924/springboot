package com.jk.vo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Pinlun implements Serializable{

	private static final long serialVersionUID = 4769584450033615323L;
	private Integer id;
	private String text;
	private Integer emp_id;
	private String des_date;
	private Integer cus_id;
	
	
	public String getDes_date() {
		return des_date;
	}
	public void setDes_date(String des_date) {
		this.des_date = des_date;
	}
	//业务字段
	private String emp;
	private String cusname;
	
	@Override
	public String toString() {
		return "Pinlun [id=" + id + ", text=" + text + ", emp_id=" + emp_id
				+ ", des_date=" + des_date + ", cus_id=" + cus_id + ", emp="
				+ emp + ", cusname=" + cusname + "]";
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public Integer getCus_id() {
		return cus_id;
	}
	public void setCus_id(Integer cus_id) {
		this.cus_id = cus_id;
	}
}
