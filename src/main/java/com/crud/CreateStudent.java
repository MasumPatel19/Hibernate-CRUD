package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateStudent {

	public static void main(String[] args) {

		SessionFactory factory = SessioFactoryProvider.provideFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student s = new Student();
		s.setName("Student 4");
		s.setStd(9);

		session.save(s);

		tx.commit();
		session.close();
		factory.close();

	}

}
