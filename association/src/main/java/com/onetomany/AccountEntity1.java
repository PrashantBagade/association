package com.onetomany;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="AccountTable")
public class AccountEntity1 implements Serializable {

	/**
	 * @author Prashant
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AccId")
	private int accountId;
	@Column(name="AccNumber")
	private String accountNumber;
	@ManyToOne
	private EmployeeEntity1 employee;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public EmployeeEntity1 getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeEntity1 employee) {
		this.employee = employee;
	}
	public AccountEntity1() {
		super();
	}
	
}
