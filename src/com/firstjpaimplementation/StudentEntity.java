package com.firstjpaimplementation;

import javax.persistence.*;
import java.util.*;

@Entity  
@Table(name="student")  

public class StudentEntity {  
  
	@Id
	private int id;
	
	private String name;
	private int age;
	
	@ElementCollection  
    private List<Address> address=new ArrayList<Address>();  
	 
    public StudentEntity(int id, String name, int age) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.age = age;  
    }  
  
    public StudentEntity() {  
        super();  
    }  
  
    public int get_id() {  
        return id;  
    }  
  
    public void set_id(int id) {  
        this.id = id;  
    }  
  
    public String get_name() {  
        return name;  
    }  
  
    public void set_name(String name) {  
        this.name = name;  
    }  
  
    public int get_age() {  
        return age;  
    }  
  
    public void set_age(int age) {  
        this.age = age;  
    }  
    

    public List<Address> getAddress() {  
        return address;  
    }  
  
    public void setAddress(List<Address> address) {  
        this.address = address;  
    }  

  
      
}  