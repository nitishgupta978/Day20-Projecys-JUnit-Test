package com.bridgelabz.controller;

import java.util.Scanner;

import com.bridgelabz.Regextest.ValidationOfRegexTest;

import com.bridgelabz.model.CustomerDetails;

public class UserRegistraionsApp {
 	static Scanner sc = new Scanner(System.in);
	
 	private static void Registrion() {
		// TODO Auto-generated method stub
 		
 		CustomerDetails customer = new  CustomerDetails();
 		System.out.println("Enter your FirstName");
 		String firstName = sc.next();
 		ValidationOfRegexTest.CheckStartWithCap(firstName);
 		customer.setFirstName(firstName);
 		
 		System.out.println("Enter your Last Name");
 		String lastname = sc.next();
 		ValidationOfRegexTest.CheckStartWithCap(lastname);
 		customer.setLastName(lastname);
 		
 		System.out.println("Please Enter the Mobile Number");
 		String mobileNo = sc.next();
 		ValidationOfRegexTest.CheckAllDigit(mobileNo);
 		customer.setMobileNo(mobileNo);
 		
 		System.out.println("Enter your password");
 		String password = sc.next();
 		ValidationOfRegexTest.CheckPreDefinePassWord(password);
 		customer.setPassword(password);
 		

 		System.out.println("Enter your Email");
 		String email = sc.next();
 		ValidationOfRegexTest.CheckEmail(email);
 		customer.setEmail(email);
		
 		System.out.println("customer "+customer);
 		
	}
 	private static void ShowAllUsers() {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		int ch=1;
		do {
		System.out.println("Welcome");
		System.out.println("1  user Registration");
		System.out.println("2 show all user Registration ");
		System.out.println("Please chose your choice");
		int choise = sc.nextInt();
		
		switch (choise) {
		
		case 1:
			Registrion();
			break;
		case 2:  
				ShowAllUsers();
				break;
		default:
				break;
				}
		System.out.println("If you Continue than press 1....");
		ch = sc.nextInt();
		}while(ch==1);
		System.out.println("Invaild");
	}
}
