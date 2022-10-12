package com.nt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "EMP")
@Data
public class EmployeeModel  implements Serializable{
	@Id
	@SequenceGenerator(name = "gen1" ,sequenceName = "EMP_ID_SEQ" ,initialValue =3000,allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer empno;
	
	@Column(length = 20)
	private String ename;
	
	@Column(length = 20)
	private String job;
	
	private float sal;
	 
	private Integer deptno=10;
	
	}