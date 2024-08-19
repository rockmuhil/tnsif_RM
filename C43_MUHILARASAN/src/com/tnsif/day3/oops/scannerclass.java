package com.tnsif.day3.oops;

import java.util.Scanner;
public class scannerclass {
	
public static void main(String[] args) {
		
		try (Scanner scam = new Scanner(System.in)) {
			System.out.println("Enter your name:");
			String str = scam.nextLine();
			System.out.println("Your name is "+str);
		}

	}

	
}