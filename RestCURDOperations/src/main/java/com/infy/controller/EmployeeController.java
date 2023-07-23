package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.EmployeeEntity;
import com.infy.service.EmployeImpl;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeImpl service;

	@PostMapping("/save")
	public ResponseEntity<String> saveEmp(@RequestBody EmployeeEntity entity) {

		String saveEmployee = service.saveEmployee(entity);

		return new ResponseEntity<String>(saveEmployee, HttpStatus.CREATED);

	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<EmployeeEntity> findbyID(@PathVariable Integer id) {
		EmployeeEntity empDetails = service.getEmpDetails(id);
		return new ResponseEntity<EmployeeEntity>(empDetails, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Integer id) {
		String empDetails = service.deleteEmp(id);
		return new ResponseEntity<String>(empDetails, HttpStatus.OK);

	}

	@GetMapping("all")
	public List<EmployeeEntity> findAll() {
		List<EmployeeEntity> findAll = service.findAll();
		return findAll;

	}

	@GetMapping("activerecords")
	public ResponseEntity<List<EmployeeEntity>> findActiveSwitch() {
		List<EmployeeEntity> findAll = service.activeEmpRecords();
		return new ResponseEntity<>(findAll, HttpStatus.OK);

	}

	@PutMapping("/save")
	public ResponseEntity<String> updateEmp(@RequestBody EmployeeEntity employeeEntity) {
		String updateEmpDetails = service.updateEmpDetails(employeeEntity);
		return new ResponseEntity<String>(updateEmpDetails, HttpStatus.OK);
	}
}
