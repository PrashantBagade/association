package com.association.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.association.util.DbConnection;
import com.manytomany.bidirection.Authors;
import com.manytomany.bidirection.Books;

public class Testmanytomanybidir {

	public static void main(String[] args) {

		    Session sessionOne=DbConnection.getSessionFactory().openSession();
			sessionOne.beginTransaction();
			
			
			Authors a1 = new Authors();
			a1.setAuthorName("prashant");
			
			Authors a2 = new Authors();
			a2.setAuthorName("jaideep");
			
					
			Set<Authors> authorset1 = new HashSet<Authors>();
			authorset1.add(a1);
			
			Set<Authors> authorset2 = new HashSet<Authors>();
			authorset2.add(a2);
			
			Books b1 = new Books();
			b1.setAuthors(authorset1);
			b1.setBookName("Dotnet");
			
			Books b2 = new Books();
			b2.setAuthors(authorset2);
			b2.setBookName("Oracle");
			
			Books b3 = new Books();
			b3.setAuthors(authorset2);
			b3.setBookName("Java");
			
			sessionOne.save(b1);
			sessionOne.save(b2);
			sessionOne.save(b3);
			
			sessionOne.flush();
			sessionOne.getTransaction().commit();
			sessionOne.close();
			
		   }
	}


