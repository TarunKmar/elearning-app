package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.EmployeeModel;

public interface EmployeeRepo extends JpaRepository<EmployeeModel, Integer>{

}
