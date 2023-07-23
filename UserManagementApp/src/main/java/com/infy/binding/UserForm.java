package com.infy.binding;

public class UserForm {

	private String fname;

	private String lname;

	private String email;

	private long phNumber;

	private String gender;

	private Integer countryId;

	private Integer stateId;

	private Integer cityId;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
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

	@Override
	public String toString() {
		return "UserForm [fname=" + fname + ", lname=" + lname + ", email=" + email + ", phNumber=" + phNumber
				+ ", gender=" + gender + ", countryId=" + countryId + ", stateId=" + stateId + ", cityId=" + cityId
				+ "]";
	}

}
