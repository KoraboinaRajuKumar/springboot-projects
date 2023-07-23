package com.infy;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxAvg {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "raju", 2300.00);
		Employee e2 = new Employee(1, "kumar", 77300.00);
		Employee e3 = new Employee(1, "rajukumar", 12300.00);
		Employee e4 = new Employee(1, "shiva", 32300.00);

		Stream<Employee> lists = Stream.of(e1, e2, e3, e4);
		//Optional<Employee> collect = lists.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		//Employee employee = collect.get();
		//System.out.println(employee);
		
		//Optional<Employee> collect2 = lists.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		///Employee employee = collect2.get();
		//System.out.println(employee);
		
		
		Double collect = lists.collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(collect);
	}

}

class Employee {
	Integer id;
	String name;
	Double salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}