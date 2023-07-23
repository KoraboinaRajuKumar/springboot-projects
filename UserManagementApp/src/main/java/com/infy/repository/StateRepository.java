package com.infy.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entity.StateMaster;

public interface StateRepository extends JpaRepository<StateMaster, Serializable> {

	//public List<StateMaster> findbyStateId(Integer countryid);

}
