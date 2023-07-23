package com.infy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STATE_MASTER")
public class StateMaster {

	@Id
	private Integer stateId;

	private String stateName;

	private Integer countryId;

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	@Override
	public String toString() {
		return "StateMaster [stateId=" + stateId + ", stateName=" + stateName + ", countryId=" + countryId + "]";
	}

}
