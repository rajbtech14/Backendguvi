package com.oops1;
import java.util.Scanner;
public class Product implements  Taxable{

	private int pid;
	private double price;
	private int quantity;
	
	public Product(int pid, double price,int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	@Override
	public double calcultetax() {
		
		return price* salestax;
	}

}
