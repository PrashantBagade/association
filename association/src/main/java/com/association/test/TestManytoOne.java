package com.association.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.association.util.DbConnection;
import com.manytoone.ClassRoomEntity;
import com.manytoone.StudentEntity;
public class TestManytoOne {

	public static void main(String[] args) {

		Session session=DbConnection.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		 StudentEntity s1=new StudentEntity();
		 s1.setStudentName("Prashant");
		 
		 StudentEntity s2=new StudentEntity();
		 s2.setStudentName("Jaideep");
		 
		 StudentEntity s3=new StudentEntity();
		 s3.setStudentName("Swapnil");
		 
		 StudentEntity s4=new StudentEntity();
		 s4.setStudentName("Sunil");
		 
		 ClassRoomEntity c1=new ClassRoomEntity();
		
		 c1.setClassName("Java");
		 
	     ClassRoomEntity c2=new ClassRoomEntity();
		 c2.setClassName("Oracle");
		
		 Set<StudentEntity> studsOfClass=new HashSet<StudentEntity>();
		 studsOfClass.add(s1);
		 studsOfClass.add(s2);
		 
		 Set<StudentEntity> studsOfClass1=new HashSet<StudentEntity>();
		 studsOfClass1.add(s3);
		 studsOfClass1.add(s4);
		 
		 c1.setStudent(studsOfClass);
		 c2.setStudent(studsOfClass1);
		 session.save(c1);
		 session.save(c2);
		 session.flush();
		 transaction.commit();
		 session.close();
	}
}
