package com.nt.service;

import java.util.List;
import com.nt.model.EmployeeModel;

public interface IEmployeeService {
	
	//To Get AllEmployeeDetails
	public List<EmployeeModel> GetAllEmployeeDetails();
	
	//To Save Employee Detais
	public String SaveEmployeeDetails(EmployeeModel emp);
	
	//To Retrive EmpId to GetAllDetails
	public EmployeeModel getEmployeeById(int eno) ;
	
	//To Update EmployeeDetails
	
	public String UpdateEmployeeDetails(EmployeeModel emp);
	
	//To DeleteEmployee
	
	public String deleteEmployee(int eno);

}
