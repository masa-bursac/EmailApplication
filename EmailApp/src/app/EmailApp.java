package app;

public class EmailApp {

	public static void main(String[] args) {
		Email email1 = new Email("John", "Smith");
		

		email1.setAlternateEmail("new.email@dep.comp.com");
		email1.setMailboxCapacity(200);
		//email1.changePassword("password");
		
		System.out.println("New email: " + email1.getAlternateEmail() + "\nNew capacity: " + email1.getMailboxCapacity() + "\nNew password: " + email1.getPassword());
	}

}
