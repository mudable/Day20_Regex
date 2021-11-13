package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstName();

	}

	Scanner sc;

	public void firstName() {
		sc = new Scanner(System.in);
		System.out.print("Enter First Name :: ");
		String FirstName = sc.next();
		boolean answer = Pattern.matches("[A-Z]+([a-z]+)*{3,}", FirstName);
		if (answer) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid first name ");
		}

	}
}