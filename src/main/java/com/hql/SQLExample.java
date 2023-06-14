package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.crud.Student;

public class SQLExample {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		NativeQuery query = session.createSQLQuery("Select * from Student where std=1");
		List<Object[]> list = query.getResultList();
		for (Object[] s : list) {
			System.out.println(Arrays.toString(s));
		}

		session.clear();
		factory.close();

	}

}
