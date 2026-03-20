package com.demo.studentapp.model; 
import jakarta.persistence.*; 
import lombok.*; 
@Entity 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Contacts { 
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private Integer id; 
private String name; 
private long phone; 
 
} 