package com.firstjpaimplementation;

import javax.persistence.*; 
import java.util.*;
public class PersistStudent {  
      
    public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("First_JPA");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        StudentEntity s1=new StudentEntity();  
        s1.set_id(101);  
        s1.set_name("Gaurav");  
        s1.set_age(24);  
          
        StudentEntity s2=new StudentEntity();  
        s2.set_id(102);  
        s2.set_name("Ronit");  
        s2.set_age(22);  
          
        StudentEntity s3=new StudentEntity();  
        s3.set_id(103);  
        s3.set_name("Rahul");  
        s3.set_age(26);  
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
        em.getTransaction().commit();  
         
        
        emf.close();  
        em.close();  
          
    }  
    
}  
