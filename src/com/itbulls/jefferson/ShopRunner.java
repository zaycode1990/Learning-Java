package com.itbulls.jefferson;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ShopRunner {
	  public static void main( String[] args) {
	        ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(new Product(0, "Crew Neck", 20.00), new Product(1, "V-Neck", 20.00), new Product(2, "Polo", 25.50), new Product(3, "Boat Neck", 30.25), new Product(4, "Tank Top", 15.75)));
	        Shop shop = new Shop(products);
	        Menu menu = new Menu(new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8"))), shop);        
	        menu.greet();
	        menu.executeMenu();
	    }
	  
}


