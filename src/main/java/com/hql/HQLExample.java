package com.hql;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.crud.SessioFactoryProvider;
import com.crud.Student;

public class HQLExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		/*
		 * Get all student records
		 */

//		String query = "from Student";
//		Query q = session.createQuery(query);
//		List<Student> list = q.list();
//		for (Student s : list) {
//			System.out.println(s);
//		}

		/*
		 * Get particular student record
		 */

//		//		String query = " from Student where name='Student 2'";
//		//		String query = " from Student where name=:nm";
//		String query = " from Student as s where s.name=:nm";
//		Query query2 = session.createQuery(query);
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter name : ");
//		String s = scanner.nextLine();
//
//		query2.setParameter("nm", s);
//		List resultList = query2.getResultList();
//		System.out.println(resultList);

		/*
		 * delete student record
		 */

//		Transaction tx = session.beginTransaction();
//		String query = " delete from Student where std=9";
//		Query q = session.createQuery(query);
//		int executeUpdate = q.executeUpdate();
//		System.out.println("Deleted " + executeUpdate);
//		tx.commit();

		/*
		 * Update student record
		 */

//		Transaction tx = session.beginTransaction();
//		Query q = session.createQuery("update student set name='Updated Student' where std=1");
//		q.executeUpdate();
//		tx.commit();	

		/*
		 * Join Query
		 */

//		Query q = session
//				.createQuery("select q.queId,q.quetion,a.answer from QuestionHQL as q INNER JOIN q.answer as a");
//		List<Object[]> resultList = q.getResultList();
//		for (Object[] s : resultList) {
//			System.out.println(Arrays.toString(s));
//		}

		/*
		 * Pagination
		 */

		Query query = session.createQuery("from Student");
		query.setFirstResult(0);
		query.setMaxResults(3);
		List<Student> list = query.getResultList();
		for (Student s : list) {
			System.out.println(s.getId() + " | " + s.getName() + " | " + s.getStd());
		}

		session.close();
		factory.close();
	}
}
