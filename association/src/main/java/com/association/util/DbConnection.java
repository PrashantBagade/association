package com.association.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class DbConnection {

	public static SessionFactory getSessionFactory(){
	
		return new AnnotationConfiguration().configure().buildSessionFactory();
		
	}
}
