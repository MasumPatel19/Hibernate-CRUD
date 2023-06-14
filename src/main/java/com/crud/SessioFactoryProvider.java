package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessioFactoryProvider {

	public static SessionFactory provideFactory() {
		
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		return cfg.buildSessionFactory();

		SessionFactory s = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		return s;

	}

}
