package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.EmployeeModel;
import com.nt.service.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private IEmployeeService service;
	
	@GetMapping("/")
	public String ShowHome() {
		return "home";
		
}
	//To Get All Employees Data
	@GetMapping("/report")
	public String ShowAllEmployeeData(Map<String, Object> map) {
		List<EmployeeModel> empsList=service.GetAllEmployeeDetails();
		map.put("empsList", empsList);
		return "report";
		}
	//To Show EmployeeForm
	@GetMapping("/add")
	public String ShowEmployeeForm(@ModelAttribute("emp" ) EmployeeModel emp) {
		return "AddEmployee";
		}
	//To Add EmployeeDetails
	@PostMapping("/add")
	public String AddEmployee(@ModelAttribute("emp") EmployeeModel emp,Map<String, Object> map) {
		
		
		String result=service.SaveEmployeeDetails(emp);
		
		List<EmployeeModel> empsList=service.GetAllEmployeeDetails();
		
		map.put("resultMsg", result);

		map.put("empsList", empsList);
       return "report";
		}
//To EditEmployeeForm Details
	@GetMapping("/edit_employee")
	public String EmployeeEditForm(@ModelAttribute("emp") EmployeeModel emp,@RequestParam("eno") int eno,Map<String, Object>map) {
		EmployeeModel emp1=service.getEmployeeById(eno);
		BeanUtils.copyProperties(emp1,emp);
		return "edit_employee";
		}
	//To UpdateEmployeeFormDetais
	@PostMapping("/edit_employee")
	public String UpdateEmployeeForm(@ModelAttribute("emp") EmployeeModel emp,Map<String, Object>map) {
		
		String result=service.UpdateEmployeeDetails(emp);
		List<EmployeeModel> empsList=service.GetAllEmployeeDetails();
		map.put("resultMsg", result);
		map.put("empsList", empsList);
      return "report";
		}
	//To Delete Employeeyee
	
	@GetMapping("/delete_employee")
	public String Delete_Employee(@RequestParam("eno") int eno,Map<String, Object> map) {
		
		String result=null;
if(eno==225) {
			
			
			return "error";
		}else {
			
			
			result=service.deleteEmployee(eno);
List<EmployeeModel> empsList=service.GetAllEmployeeDetails();
		map.put("empsList", empsList);
			map.put("resultMsg", result);
	     	return "report";
		}
		
     	
			}
			/*
	@GetMapping("/delete_employee")
	public String Delete_Employee(){
		return "error";
		*/
		

	

	
	
}
