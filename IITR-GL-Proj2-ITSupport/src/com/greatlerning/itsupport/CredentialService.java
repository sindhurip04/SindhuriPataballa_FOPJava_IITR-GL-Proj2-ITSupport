package com.greatlerning.itsupport;
import java.util.Random;

public class CredentialService {
	
	Random rn = new Random();
	
	public void generateEmailAddress(Employee emp, String dept) {
		String email = emp.firstName+emp.lastName+"@"+dept+".sp.com";
		emp.email = email;
	}
	public void generatePassword(Employee emp) {
		char[] password = new char[10];
		password[0] = (char)(rn.nextInt(65, 90));
		password[1] = (char)(rn.nextInt(97, 122));
		password[2] = (char)(rn.nextInt(48, 57));
		password[3] = (char)(rn.nextInt(35, 38));
		password[4] = (char)(rn.nextInt(65, 91));
		password[5] = (char)(rn.nextInt(97, 123));
		password[6] = (char)(rn.nextInt(48, 58));
		password[7] = '@';
		password[8] = 's';
		password[9] = 'p';
		String pass = new String(password);
		emp.setPassword(pass);
	}

}
