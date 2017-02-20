package com.onetomany;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="EmployeeTable")

public class EmployeeEntity1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 601163542782870226L;
	@Id
	@Column(name="EmpId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeId;
	@Column(name="EmpName")
	private String employeeName;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="EmpId")
	private Set<AccountEntity1> accounts;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Set<AccountEntity1> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<AccountEntity1> accounts) {
		this.accounts = accounts;
	}
	public EmployeeEntity1() {
		super();
	}

}
