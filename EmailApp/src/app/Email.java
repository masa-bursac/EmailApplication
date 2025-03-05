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
}
