package com.itbulls.jefferson;
import java.util.ArrayList;



public class Shop {
	private ArrayList<Product> products;
    
	private String name = "T-Shirt Mart";
	    
	private Cart cart = new Cart();
	    
	public Shop(ArrayList<Product> products){
	this.products = products;
	}

	public void printProducts(){
	System.out.println("--Products--");
	for (Product product : products){
	System.out.println("ID " + product.getID() + ": " + product.getName() + " - " + "$" + product.getPrice());
	}
	}

	public int findProduct(String searchText){
	int result = 0;
	for (Product product : products) {
	if (product.getName().equals(searchText)) {
	result = product.getID();
	break;
	}
	else {
	result = -1;
	}
	}
	return result; 
	}
	    
	public ArrayList<Product> getProduct() {
	return products;
	}
	
	public void addProduct(int input) {
		boolean found = false;
		for (Product product : products) {
			if (input == product.getID()) {
				this.cart.addItem(product);
				found = true;
			}
		}
		if (found == false) {
			System.out.println("That item ID is invalid and could not be added to the cart.");
		}
	}
	    
	public String getName() {
	    return name;
	}
	    
	public Cart getCart(){
	  return this.cart;  
	}
}
