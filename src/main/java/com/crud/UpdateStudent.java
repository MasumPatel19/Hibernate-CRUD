package com.crud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateStudent {

	public static void main(String[] args) {

		SessionFactory factory = SessioFactoryProvider.provideFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		String updatedName;
		int updatedStd, sid, choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student id for updating records : ");
		sid = Integer.parseInt(scanner.nextLine());

		Student student = session.get(Student.class, sid);

		System.out.println("\nWhat you want to change ? \n 1. Student Name\n 2. Student std\n");
		choice = Integer.parseInt(scanner.nextLine());

		if (choice == 1) {
			System.out.println("\nEnter Student Name : ");
			updatedName = scanner.nextLine();
			student.setName(updatedName);
		} else if (choice == 2) {
			System.out.println("\nEnter Student std : ");
			updatedStd = scanner.nextInt();
			student.setStd(updatedStd);
		} else {
			System.out.println("\nEnter Student Name : ");
			updatedName = scanner.nextLine();
			student.setName(updatedName);

			System.out.println("\nEnter Student std : ");
			updatedStd = scanner.nextInt();
			student.setStd(updatedStd);
		}

//		student.setName("Updated record");
//		student.setStd(4);
//		session.save(student);
		tx.commit();
		session.close();

	}

}
