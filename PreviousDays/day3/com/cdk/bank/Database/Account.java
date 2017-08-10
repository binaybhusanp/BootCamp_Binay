package com.cdk.bank.Database;
import com.cdk.bank.Services.AccountServices;

public class Account extends AccountServices {
	static int accNo;
	String ifsc ;
	
	Account(int accNo, String ifsc) {
		System.out.println("Account(int accNo, String ifsc)");
		this.accNo = accNo;
		this.ifsc = ifsc;
	}
	
	public void display() {
		super.display();
		System.out.println("accNo : " + accNo);
		System.out.println("ifsc : " + ifsc);
	}
}