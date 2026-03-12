package com.example;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   private String name;
   private String books;
   private String issuedDate;

   public Student() {}

   public Student(String name, String books, String issuedDate) {
       this.name = name;
       this.books = books;
       this.issuedDate = issuedDate;
   }

   public String getName() {
       return name;
   }

   public String getBooks() {
       return books;
   }

   public String getIssuedDate() {
       return issuedDate;
   }

   public void setName(String name) {
       this.name = name;
   }

   public void setBooks(String books) {
       this.books = books;
   }

   public void setIssuedDate(String issuedDate) {
       this.issuedDate = issuedDate;
   }
}
