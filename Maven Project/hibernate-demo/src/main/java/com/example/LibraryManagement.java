package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LibraryManagement {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {

            session.beginTransaction();

            session.save(new Student("John Doe", "The Great Gatsby", "2024-06-01"));
            session.save(new Student("Jane Smith", "To Kill a Mockingbird", "2024-06-01"));
            session.save(new Student("Bob Johnson", "The Catcher in the Rye", "2025-01-15"));
            session.save(new Student("Alice Brown", "1984", "2025-02-20"));
            session.save(new Student("Charlie Wilson", "Brave New World", "2025-03-10"));
            session.save(new Student("Diana Lee", "Lord of the Flies", "2025-04-05"));
            session.save(new Student("Eve Davis", "Animal Farm", "2025-05-01"));
            session.save(new Student("Frank Miller", "The Grapes of Wrath", "2025-06-01"));

            session.getTransaction().commit();

            System.out.println("All students saved successfully!");

        } finally {

            session.close();
            factory.close();

        }
    }
}