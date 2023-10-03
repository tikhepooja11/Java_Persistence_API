package com.firstjpaimplementation;
import java.util.Scanner;

import javax.persistence.*;
import java.util.Objects;
import java.util.List;


public class UpdateStudentRecord {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("First_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//FindStudent with id
        System.out.println("Enter the student id to whose name is to be changed :");
    	Scanner sc = new Scanner(System.in);
    	int id = sc.nextInt();
    	StudentEntity s = em.find(StudentEntity.class,id);
    	if (Objects.isNull(s) )
    	{
            System.out.println("Object is Null...Student with this id is not found");
    	}else
    	{
    		System.out.println("Enter the new name :");
    		String name = sc.next();
    		s.set_name(name);
    		
    		System.out.println("Student table after updation..\n");
    		Query query = em.createQuery("Select s from StudentEntity s");
    		@SuppressWarnings("unchecked")
    		
    		List<StudentEntity> list = (List<StudentEntity>)query.getResultList();
    		System.out.print("id");  
            System.out.print("\t name");  
            System.out.println("\t age \n");  
            for(int i=0;i<list.size();i++)  
            {  
             System.out.print(list.get(i).get_id());  
             System.out.print("\t"+list.get(i).get_name());     
             System.out.print("\t"+list.get(i).get_age());     
             System.out.println("\n");
            }  
    	}
    	em.getTransaction().commit();  
        em.close();  
        emf.close();   
    	System.out.println("Program executed succesfully..!");

	}

}
