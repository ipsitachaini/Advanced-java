package com.demo.studentapp.repository; 
 
import com.demo.studentapp.model.Contacts; 
import org.springframework.data.jpa.repository.JpaRepository; 
 
public interface StudentRepository extends JpaRepository<Contacts, Integer> { 
}