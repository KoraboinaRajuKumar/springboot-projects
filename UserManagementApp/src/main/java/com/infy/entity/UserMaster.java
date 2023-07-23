package com.infy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER_MASTER")
public class UserMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;

	private String fname;

	private String lname;

	private String email;

	private long phNumber;

	private String gender;

	private Integer countryId;

	private Integer stateId;

	private Integer cityId;

	private String userPwd;

	private String activStatus;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getActivStatus() {
		return activStatus;
	}

	public void setActivStatus(String activStatus) {
		this.activStatus = activStatus;
	}

	@Override
	public String toString() {
		return "UserMaster [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phNumber="
				+ phNumber + ", gender=" + gender + ", countryId=" + countryId + ", stateId=" + stateId + ", cityId="
				+ cityId + ", userPwd=" + userPwd + ", activStatus=" + activStatus + "]";
	}

}
