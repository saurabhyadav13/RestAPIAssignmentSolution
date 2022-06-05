package com.saurabh.employees.service;

import java.util.List;

import com.saurabh.employees.entity.Employee;
import com.saurabh.employees.entity.Role;
import com.saurabh.employees.entity.User;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

	public List<Employee> searchByFirstName(String firstName);

	public List<Employee> sortByFirstName(String order);

	public User saveUser(User user);

	public Role saveRole(Role role);

}
