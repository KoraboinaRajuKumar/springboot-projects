package com.infy.repositoty;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Serializable>

{
	public List<EmployeeEntity> findByactiveSwitch(String active);
}
