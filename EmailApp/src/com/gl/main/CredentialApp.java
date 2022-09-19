package com.gl.main;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class CredentialApp {

	// main method
	public static void main(String[] args) {

		Employee employee = new Employee("Anuj", "Sharma");
		CredentialService credentialservice = new CredentialService();

		String generatedEmail = "";
		char[] generatedPwd;

		System.out.println("Please enter the department from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();

		// calling credentials service method for different departments using getter method
		if (option == 1) {
			generatedEmail = credentialservice.generateEmailAddress(employee.getFirstName(), employee.getLastName(),
					"tech");

		} else if (option == 2) {
			generatedEmail = credentialservice.generateEmailAddress(employee.getFirstName(), employee.getLastName(),
					"adm");

		} else if (option == 3) {
			generatedEmail = credentialservice.generateEmailAddress(employee.getFirstName(), employee.getLastName(),
					"hr");

		} else if (option == 4) {
			generatedEmail = credentialservice.generateEmailAddress(employee.getFirstName(), employee.getLastName(),
					"lgl");

		} else {
			System.out.println("Enter a valid option");
			System.exit(-1);
		}
		generatedPwd = credentialservice.generatePassword();
		credentialservice.showCredentials(employee.getFirstName(), generatedEmail, generatedPwd);

		scanner.close();
	}

}
