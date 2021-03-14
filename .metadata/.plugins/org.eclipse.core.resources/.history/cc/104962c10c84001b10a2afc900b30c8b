package com.jpa.testjpa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.testjpa.model.Employee;
import com.jpa.testjpa.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	@GetMapping("/")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	@PostMapping("/")
	
	public String addEmployee (@RequestBody Employee emp) {
		
		return employeeService.addEmployee(emp);
	}
	@PutMapping("/")
	
	public String editEmployee (@RequestBody Employee emp) {
		
		return employeeService.editEmployee(emp);
	}
    @DeleteMapping("/{id}")
	
	public String DeleteEmployee (@PathVariable("id") int id) {
		
		return employeeService.deleteEmployee(id);
	}
    @GetMapping("/page")
	public Map<String , Object> get(@RequestParam (value="pageno" , required = false, defaultValue = "0")int pageno
			, @RequestParam(value = "pagesize" , required = false , defaultValue = "4") int pagesize,
			@RequestParam(value = "sortBy", required = false , defaultValue = "id")String sortby ){
    	
		return employeeService.get(pageno , pagesize,sortby);
	}
    
    @GetMapping("/search")
	public List<Employee> search(@RequestParam(value="searchword") String searchword){
		return employeeService.search(searchword);
	}
}
