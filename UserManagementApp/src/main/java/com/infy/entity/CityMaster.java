package com.infy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CITY_MASTER")
public class CityMaster {

	@Id
	private Integer cityId;

	private String cityname;

	private Integer stateId;

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	@Override
	public String toString() {
		return "CityMaster [cityId=" + cityId + ", cityname=" + cityname + ", stateId=" + stateId + "]";
	}

}
