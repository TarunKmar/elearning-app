package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.EmployeeModel;
import com.nt.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
@Autowired
	private EmployeeRepo  repo;

	@Override
	public List<EmployeeModel> GetAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	//To Add EmployeeDetais
     @Override
	public String SaveEmployeeDetails(EmployeeModel emp) {
		// TODO Auto-generated method stub
    	   int idVal= repo.save(emp).getEmpno();
		return "Employee Saved With Id="+idVal;
	}
     
     //To Get Employee Details Id
	@Override
	public EmployeeModel getEmployeeById(int eno) {
		// TODO Auto-generated method stub
		EmployeeModel emp=repo.findById(eno).get();
		return emp;
	}
	
	//To Update EmployeeDetails
	@Override
	public String UpdateEmployeeDetails(EmployeeModel emp) {
		// TODO Auto-generated method stub
		
		int idval=repo.save(emp).getEmpno();
		return "Employee Updated"+idval;
	}
	
	//To Delete Employee
	@Override
	public String deleteEmployee(int eno) {
		// TODO Auto-generated method stub
		
		repo.deleteById(eno);
		return eno+"Emp no Employee is Deleted";
	}
	
	
	
	
	
	

}
