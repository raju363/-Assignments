package com.prolifics.firstmavenapp;
import java.time.LocalDate;
public class Account {
private int accountNumber;
private double balance;
private  String accountHoldername;
private LocalDate openDate;
private Account() {}
public Account(int accountNumber, double balance, String accountHoldername, LocalDate openDate) {
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.accountHoldername = accountHoldername;
	this.openDate = openDate;
}
public boolean equals(Object obj){
	if(obj instanceof Account) {
		Account a=(Account)obj;
		return(accountNumber==a.accountNumber && balance==a.balance && accountHoldername==a.accountHoldername);
	}
	return false;
}
public String toString() {
	return "accountNumber"+ accountNumber +"\nBalance"+balance+"\nAccount Holder Name"+ accountHoldername +"\n openDate"+ openDate;	

}
public static void main(String[]args) {
	
	
//	Account a =new Account(7001,15000,"Ajay",LocalDate.now());
//	System.out.println(a);
	Account a1 =new Account(7001,15000,"Ajay",LocalDate.now());	
	Account a2 =new Account(7001,15000,"Ajay",LocalDate.now());	
	System.out.println(a1);
}

}

