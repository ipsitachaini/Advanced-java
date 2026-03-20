package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class OrderAnalysis {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Order.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {
            
            session.beginTransaction();

            session.save(new Order(101,"Laptop",70000,12,"2025-03-10"));
            session.save(new Order(102,"Phone",30000,15,"2024-12-09"));
            session.save(new Order(103,"Tablet",20000,18,"2023-03-08"));
            session.save(new Order(104,"Headphones",5000,20,"2026-02-07"));
            session.save(new Order(105,"Keyboard",2000,25,"2020-05-11"));
            session.save(new Order(107,"Mouse",700,12,"2020-09-10"));
            session.save(new Order(108,"CPU",30000,15,"2026-10-09"));
            session.save(new Order(109,"Monitor",50000,20,"2025-06-07"));
            session.save(new Order(110,"Earbuds",2000,25,"2024-01-11"));
            session.save(new Order(111,"Pendrive",1000,18,"2023-02-08"));
            session.save(new Order(112,"Table",70000,12,"2025-03-10"));
            session.save(new Order(113,"Phone",30000,15,"2024-12-09"));
            session.save(new Order(114,"Chair",200,18,"2023-03-10"));
            session.save(new Order(115,"Fridge",50000,20,"2026-02-17"));
            session.save(new Order(116,"Almira",2000,25,"2020-05-12"));
            session.save(new Order(117,"Shoe Rack",700,12,"2020-12-14"));
            session.save(new Order(118,"Almira",30000,15,"2026-10-19"));
            session.save(new Order(119,"Table",500,20,"2025-08-20"));
            session.save(new Order(120,"Earbuds",20000,25,"2024-01-21"));
            session.save(new Order(121,"Watch",10000,18,"2023-12-28"));

            session.getTransaction().commit();
            session.beginTransaction();

            System.out.println("Sort Orders By:");
            System.out.println("1. Order Date");
            System.out.println("2. Total Amount");

            int choice = sc.nextInt();

            Query<Order> query;

            if(choice == 1){
                query = session.createQuery(
                        "from Order order by orderDate", Order.class);
            }
            else{
                query = session.createQuery(
                        "from Order order by total", Order.class);
            }

            List<Order> orders = query.getResultList();

            for(Order o : orders){

                System.out.println(
                        o.getProductId()+" | "+
                        o.getItem()+" | "+
                        o.getTotal()+" | "+
                        o.getUserId()+" | "+
                        o.getOrderDate()
                );

            }

            session.getTransaction().commit();

        }
        finally{

            session.close();
            factory.close();

        }
        sc.close();
    }
}