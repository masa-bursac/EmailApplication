package app;

import java.util.*;

public class Email {
	private String name;
	private String surname;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	public Email(String name, String surname) {
		this.name = name;
		this.surname = surname;
		System.out.println("EMAIL CREATED: " + this.name + " " + this.surname);
		
		this.department = generateDepartment();
		System.out.println("Department: " + this.department);
		
		this.password = generatePassword(9);
		System.out.println("Password: " + this.password);
	}
	
	private String generateDepartment() {
		System.out.println("Enter the department code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None");
		Scanner in = new Scanner(System.in);
		
		int input = in.nextInt();
		
		if(input == 1) { return "sales"; }
		else if(input == 2) { return "development"; }
		else if(input == 3) { return "accounting"; }
		else { return ""; }
	}
	
	private String generatePassword(int length) {
		String passwordSet = "ABCDEFGHJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
}
