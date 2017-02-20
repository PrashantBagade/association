package com.association.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Table;
@Entity
@Table(name="Employee")
public class EmployeeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Emp_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column(name="FristName")
	private String empFirstName;
	@Column(name="LastName")
	private String empLastName;
	@OneToOne(mappedBy="employee")
	AccountEntity account;
	
	public EmployeeEntity() {
		super();
	}
	public AccountEntity getAccount() {
		return account;
	}
	public void setAccount(AccountEntity account) {
		this.account = account;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

}
