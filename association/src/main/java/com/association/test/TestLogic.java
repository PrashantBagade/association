package com.association.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.association.entity.AccountEntity;
import com.association.entity.EmployeeEntity;
import com.association.util.DbConnection;

public class TestLogic {

	public static void main(String[] args) {

		Session session=DbConnection.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		

		EmployeeEntity e= new EmployeeEntity();
		  e.setEmpFirstName("Prashant");
		  e.setEmpLastName("Bagade");
		
		
		 AccountEntity a = new AccountEntity();
	        a.setAccNumber("Dummy Account ");
	        e.setAccount(a);
		   a.setEmployee(e);
	
	   
		session.save(a);
		 session.save(e);
        session.flush();
        transaction.commit();
        session.close();
        
        Integer gEmpId=e.getEmpId();
        Integer gAccId=a.getAccId();
        Session session1=DbConnection.getSessionFactory().openSession();
        Transaction tran= session1.beginTransaction();
        EmployeeEntity emp1=(EmployeeEntity) session1.get(EmployeeEntity.class, gEmpId);
        AccountEntity acc1=(AccountEntity) session1.get(AccountEntity.class, gAccId);
	    tran.commit();
	    session1.close();
	 
	  System.out.println(emp1.getEmpId());
	    System.out.println(emp1.getAccount().getAccNumber());
	
	    System.out.println(acc1.getAccId());
	    System.out.println(acc1.getEmployee().getEmpId());
	    
	}

}
