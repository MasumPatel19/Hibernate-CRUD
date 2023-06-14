package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteStudent {

	public static void main(String[] args) {

		SessionFactory factory = SessioFactoryProvider.provideFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student student = session.get(Student.class, 3);
		System.out.println(student);
		session.delete(student);

		tx.commit();
		session.clear();

	}

}
