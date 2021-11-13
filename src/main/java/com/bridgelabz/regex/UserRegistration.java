package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	/*
	 * /*created method first name which take the name start from capital. done the
	 * regex pattern for that. Added the same pattern for last name. Used regex
	 * pattern for valid gmail.
	 */
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstName();
		userRegistration.lastName();
		userRegistration.email();
		userRegistration.contactNumber();
		userRegistration.password1();
		userRegistration.password3();
	}

//User's First Name
	public void firstName() {
		System.out.print("Enter First Name :: ");
		String FirstName = sc.next();
		boolean answer = Pattern.matches("^[A-Z]{1}([a-z]*){3,}", FirstName);
		if (answer) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid first name ");
		}
	}

//User's Last Name 
	public void lastName() {
		System.out.print("Enter Last Name :: ");
		String LastName = sc.next();
		Boolean answer = Pattern.matches("^[A-Z]{1}([a-z]*){3,}", LastName);
		if (answer) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid last name ");
		}
	}

	// User's Email Address
	public void email() {
		System.out.print("Enter email ID :: ");
		String Email = sc.next();
		Boolean answer = Pattern.matches("^[a-zA-Z0-9+_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", Email);
		if (answer) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid email ID ");
		}
	}

	public void contactNumber() {
		sc = new Scanner(System.in);
		System.out.print("Enter contact number with country code :: ");
		String ContactNumber = sc.nextLine();
		boolean answer = Pattern.matches("91\\s[0-9]{10}", ContactNumber);
		if (answer) {
			System.out.println("Thank you");
		} else {
			System.out.println("enter valid contact number");
		}
	}

	public void password1() {
		// rule1 = minimum 8 characters
		sc = new Scanner(System.in);
		System.out.print("Enter password  :: ");
		String password = sc.nextLine();
		boolean answer = Pattern.matches("^(?=.*[A-Z])[A-Za-z]{8,}$", password);
		if (answer) {
			System.out.println("Thank you");
		} else {
			System.out.println("enter valid password");
		}
	}
	public void password3(){
	    // rule1 = minimum 8 characters & at least 1 upper case at least one numeric
	    sc = new Scanner(System.in);
	    System.out.print("Enter password  :: " );
	    String password = sc.nextLine();
	    boolean answer = Pattern.matches("[A-Za-z0-9]{8}",password);
	    if (answer){
	        System.out.println("Thank you");
	    }else {
	        System.out.println("enter valid password");
	    }
	}
}