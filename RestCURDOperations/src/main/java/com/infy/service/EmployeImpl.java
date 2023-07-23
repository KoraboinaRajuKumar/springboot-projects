package com.infy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.DataNotAvailbeException;
import com.infy.entity.EmployeeEntity;
import com.infy.repositoty.EmployeeRepo;

@Service
public class EmployeImpl implements IEmployee {

	@Autowired
	private EmployeeRepo repo;

	public String saveEmployee(EmployeeEntity employeeEntity) {

		employeeEntity.setActiveSwitch("Y");

		EmployeeEntity save = repo.save(employeeEntity);

		if (save.getEmpid() != null) {
			return "employee data store successfully...!";
		} else {
			return "employee data not store successfully...!";
		}

	}

	@Override
	public EmployeeEntity getEmpDetails(Integer id) {

		Optional<EmployeeEntity> findById = repo.findById(id);

		if (findById.isPresent()) {
			EmployeeEntity employeeEntity = findById.get();
			System.out.println("Data:" + employeeEntity);
			return employeeEntity;

		}
		return null;

	}

	@Override
	public String deleteEmp(Integer id) {

		Optional<EmployeeEntity> findById = repo.findById(id);

		if (findById.isPresent()) {
			EmployeeEntity employeeEntity = findById.get();
			employeeEntity.setActiveSwitch("N");
			repo.save(employeeEntity);
			return "emp data deleted successfully";

		}
		return "emp data not deleted";
	}

	@Override
	public List<EmployeeEntity> findAll() {

		return repo.findAll();
	}

	@Override
	public List<EmployeeEntity> activeEmpRecords() {

		return repo.findByactiveSwitch("Y");
	}

	@Override
	public String updateEmpDetails(EmployeeEntity employeeEntity) {
		if (repo.existsById(employeeEntity.getEmpid())) {
			repo.save(employeeEntity); // updation
			return "emp data updated..";

		}
		return "no data found";

	}
}
