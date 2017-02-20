package com.association.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.association.util.DbConnection;
import com.manytomany.ReaderEntity;
import com.manytomany.SubscriptorEntity;

public class TestJoinTable {

	public static void main(String[] args) {
 
		Session session=DbConnection.getSessionFactory().openSession();
		Transaction tran=session.beginTransaction();
	
        SubscriptorEntity subOne = new SubscriptorEntity();
        subOne.setSubscriptorName("Entertainment");
         
        SubscriptorEntity subTwo = new SubscriptorEntity();
        subTwo.setSubscriptorName("Horror");
         
        Set<SubscriptorEntity> subs = new HashSet<SubscriptorEntity>();
        subs.add(subOne);
        subs.add(subTwo);
         
        
        ReaderEntity readerOne = new ReaderEntity();
         readerOne.setReaderFirstName("Prashant");
         readerOne.setReaderLastName("Bagade");
      
         
        ReaderEntity readerTwo = new ReaderEntity();
        
        readerTwo.setReaderFirstName("Shrirang ");
        readerTwo.setReaderLastName("Morale");
         
        Set<ReaderEntity> readers = new HashSet<ReaderEntity>();
        readers.add(readerOne);
        readers.add(readerTwo);
         
        readerOne.setSubscriptions(subs);
        readerTwo.setSubscriptions(subs);
 
        session.save(readerOne);
        session.save(readerTwo);
       
        tran.commit();
        session.flush();
        session.close();
	}

}
