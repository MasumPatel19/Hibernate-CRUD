package com.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class GetStudent {

	public static void main(String[] args) {

		SessionFactory factory = SessioFactoryProvider.provideFactory();
		Session session = factory.openSession();

		/*
		 * Get student by id
		 */

		Student student = session.get(Student.class, 1);

//		Student student = session.load(Student.class, 1);
		System.out.println("Student id : " + student.getId());
		System.out.println("Student name : " + student.getName());
		System.out.println("Student std : " + student.getStd());

		System.out.println("----------------------------");

		/*
		 * Get all student
		 */

		List<Student> createQuery = session.createQuery("select s from Student s", Student.class).getResultList();
		System.out.println(createQuery);

	}

}
