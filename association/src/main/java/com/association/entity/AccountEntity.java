package com.association.entity;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="Account")
public class AccountEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Acc_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accId;
    @Column(name="ACC_Number")
	private String accNumber;
	
	@OneToOne(cascade=CascadeType.ALL)
	EmployeeEntity employee;
	
	public AccountEntity() {
		super();
	}
	public EmployeeEntity getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
}
