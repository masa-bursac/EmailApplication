package app;

import java.util.*;

public class Email {
	private String name;
	private String surname;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String email;
	private String alternateEmail;
	private String companySuffix = "mycomp.com";
	
	private int passwordLength = 9;
	
	public Email(String name, String surname) {
		this.name = name;
		this.surname = surname;
		
		this.department = generateDepartment();
		
		this.password = generatePassword(this.passwordLength);
		System.out.println("Password: " + this.password);
		
		this.email = generatePassword();
	}
	
	private String generateDepartment() {
		System.out.println("Enter the department code for new worker " + name + " " + surname +
				":"+ "\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None");
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
	
	private String generatePassword() {
		return name.toLowerCase() + "." + surname.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String email) {
		this.alternateEmail = email;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + name + " " + surname + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
