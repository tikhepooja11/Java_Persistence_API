package com.firstjpaimplementation;
import java.util.Scanner;

import javax.persistence.*;
import java.util.Objects;


public class FindStudentInTable {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("First_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//FindStudent with id
        System.out.println("Enter the student id to find :");
    	Scanner sc = new Scanner(System.in);
    	int id = sc.nextInt();
    	StudentEntity s = em.find(StudentEntity.class,id);
    	if (Objects.isNull(s) )
    	{
            System.out.println("Object is Null...Student with this id is not found");
    	}else
    	{
    		System.out.println("Student found ...! Fetching records : ");
        	System.out.println("Student id = "+s.get_id());  
            System.out.println("Student Name = "+s.get_name());  
            System.out.println("Student Age = "+s.get_age());  
    	}
    	
    	System.out.println("Program executed succesfully..!");

	}

}
