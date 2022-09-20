package com.greatlerning.itsupport;
import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you Firstname:");
		String firstName = sc.next();
		System.out.println("Please enter you Lastname:");
		String lastName = sc.next();
		Employee employee1 = new Employee(firstName, lastName);
		CredentialService service = new CredentialService();
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1-> Technical");
		System.out.println("2-> Admin");
		System.out.println("3-> Human Resource");
		System.out.println("4-> Legal");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: service.generateEmailAddress(employee1, "tech");
				break;
		case 2: service.generateEmailAddress(employee1, "admin");
				break;
		case 3: service.generateEmailAddress(employee1, "hr");
				break;
		case 4: service.generateEmailAddress(employee1, "legal");
				break;
		}
		service.generatePassword(employee1);
		System.out.println("Email --> "+employee1.email + '\n'+"Password --> "+ employee1.getPassword());

	}

}
