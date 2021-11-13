package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	/*
	 * /*created method first name which take the name start from capital. done the
	 * regex pattern for that.
	 * Added the same pattern for last name.
	 */
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstName();
		userRegistration.lastName();
	}

	Scanner sc;

//User's First Name
	public void firstName() {
		sc = new Scanner(System.in);
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
		sc = new Scanner(System.in);
		System.out.print("Enter Last Name :: ");
		String LastName = sc.next();
		Boolean answer = Pattern.matches("^[A-Z]{1}([a-z]*){3,}", LastName);
		if (answer) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid last name ");
		}
	}
}