package com.jk.vo;

import java.io.Serializable;

public class TEmp implements Serializable{

	private static final long serialVersionUID = -8261346873776419173L;
	private Integer id;
	private String EmployeeCode;
	private String employee;
	private Integer kid;
	private String Gender;
	private String Birthday;
	
	@Override
	public String toString() {
		return "TEmp [id=" + id + ", EmployeeCode=" + EmployeeCode
				+ ", employee=" + employee + ", kid=" + kid + ", Gender="
				+ Gender + ", Birthday=" + Birthday + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployeeCode() {
		return EmployeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		EmployeeCode = employeeCode;
	}
	
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
}
