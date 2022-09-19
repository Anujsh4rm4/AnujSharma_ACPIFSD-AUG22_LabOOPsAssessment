package com.gl.service;

import java.util.Arrays;
import java.util.Random;

public class CredentialService {

	//method to generate random password (aka Business method)
	public char[] generatePassword() {

		String numbers = "0123456789";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "@#$%^&*_=+-?.<>!)";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		Random random = new Random();

		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	//method to generate email address (aka Business method)
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".abccompany.com";
	}

	// method to show credentials of email address and password
	public void showCredentials(String firstName, String email, char[] pwd) {
		System.out.println("Dear" + firstName + "your generated credentials are as follows");
		System.out.println("Email -->" + email);
		System.out.println("Password -->" + Arrays.toString(pwd));
	}
}
