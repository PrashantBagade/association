package com.association.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.association.util.DbConnection;
import com.onetomany.AccountEntity1;
import com.onetomany.EmployeeEntity1;

public class TestOneToMany {

	public static void main(String[] args) {
		Session session=DbConnection.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		AccountEntity1 acc1= new AccountEntity1();
		acc1.setAccountNumber("Acc1");
		AccountEntity1 acc2= new AccountEntity1();
		acc2.setAccountNumber("Acc2");
		AccountEntity1 acc3= new AccountEntity1();
		acc3.setAccountNumber("Acc3");
		AccountEntity1 acc4= new AccountEntity1();
		acc4.setAccountNumber("Acc4");
		
		EmployeeEntity1 emp1=new EmployeeEntity1();
		emp1.setEmployeeName("Prashant");
		Set<AccountEntity1> accountOfEmp1=new HashSet<AccountEntity1>();
		accountOfEmp1.add(acc1);
		accountOfEmp1.add(acc2);
		
		EmployeeEntity1 emp2=new EmployeeEntity1();
		emp1.setEmployeeName("Jaideep");
		Set<AccountEntity1> accountOfEmp2=new HashSet<AccountEntity1>();
		accountOfEmp2.add(acc3);
		accountOfEmp2.add(acc4);
		
		emp1.setAccounts(accountOfEmp1);
		emp2.setAccounts(accountOfEmp2);
		
		session.save(emp1);
		session.save(emp2);
		transaction.commit();
		session.flush();
		session.close();
	}
}
		
