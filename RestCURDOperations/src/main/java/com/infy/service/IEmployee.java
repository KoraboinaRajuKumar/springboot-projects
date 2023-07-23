package com.infy.service;

import java.util.List;

import com.infy.entity.EmployeeEntity;

public interface IEmployee {

	public String saveEmployee(EmployeeEntity employeeEntity);

	public EmployeeEntity getEmpDetails(Integer id);

	public String deleteEmp(Integer id);

	public List<EmployeeEntity> findAll();

	public List<EmployeeEntity> activeEmpRecords();

	public String updateEmpDetails(EmployeeEntity employeeEntity);

}
