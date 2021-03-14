package com.jpa.testjpa.service;

import java.awt.print.Pageable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jpa.testjpa.model.Employee;
import com.jpa.testjpa.repository.EmployeeRepository;


@Service
public class EmployeeService {

	
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAll() {
	return 	(List<Employee>) employeeRepository.findAll();
	}

	public String addEmployee(Employee emp) {
		String response ;
		if (employeeRepository.save(emp) != null)response = "Success";
		else response = "Faild";
		return response;
	}

	public String editEmployee(Employee emp) {
		String response ;
		if (employeeRepository.save(emp) != null)response ="Edit Success";
		else response = "Edit Faild !";
		return response ;
				
	}

	public String deleteEmployee(int  id) {
		String response;
		try{
			employeeRepository.deleteById(id);
			response = "ِDelete Success";
		}
		catch(IllegalArgumentException e) {
			response = "Delete False";
		}
		return response;
	}

	public Map<String , Object> get(int pageno , int pagesize , String sortBy) {
		Map<String , Object>  response = new HashMap<String , Object>();
		PageRequest pageable =  PageRequest.of(pageno, pagesize, Sort.by(sortBy));
		Page<Employee> page = employeeRepository.findAll(pageable);
		response.put("count",page.getTotalElements());
		response.put("currentPage", page.getNumber());
		response.put("totalPages", page.getTotalPages());
		response.put("data", page.getContent());
		return response;
		
	}

	public List<Employee> search(String searchword) {
		return employeeRepository.findByFirstName(searchword);
		
	}
	

	
}
