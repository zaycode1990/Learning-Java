package com.itbulls.jefferson;

public class Product {
	private String name;
    
	 private double price;
	    
	 private int ID;
	 
	 public Product(int ID, String name, double price) {
	 this.name = name;
	 this.price = price;
	 this.ID = ID;
	 }   
	    
	 
	 public String getName(){
	 return name;
	 }     
	    

	 public double getPrice(){
	 return price;
	 }
	    
	 public int getID() {
	  return ID;   
	 }





}
