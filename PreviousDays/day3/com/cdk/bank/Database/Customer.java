package com.cdk.bank.Database;

public class Customer extends Account {
	String name;
	
	Customer(int accNo, String ifsc, String name) {
		super(accNo, ifsc);
		this.name = name;
	}
	
	void display() {
		super.display();
		System.out.println("name : " + name);
	}
}
	
	