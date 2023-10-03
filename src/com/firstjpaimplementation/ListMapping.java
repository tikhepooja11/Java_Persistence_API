package com.firstjpaimplementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListMapping {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("First_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//setting data in emdedded object
		Address a1 = new Address();
		a1.setPincode(412101);
		a1.setCity("Pune");
		a1.setState("Maharashtra");
		
		Address a2 = new Address();
		a2.setPincode(412102);
		a2.setCity("Banglore");
		a2.setState("Karnataka");
		
		Address a3 = new Address();
		a3.setPincode(412105);
		a3.setCity("Hydrabad");
		a3.setState("Andra-Pradesh");
		
		StudentEntity s1=new StudentEntity();  
	    s1.getAddress().add(a1);  
	      
	    StudentEntity s2=new StudentEntity();  
	    s2.getAddress().add(a1);  
	    
	    StudentEntity s3=new StudentEntity();   
	    s3.getAddress().add(a1);   
	      
	    em.persist(s1);  
	    em.persist(s2); 
	    em.persist(s3); 
	    
	    em.getTransaction().commit();  
	      
	    em.close();  
	    emf.close(); 
		
		
		
		
		
		

	}

}
