package com.assited.project1;


	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;



	public class ValidationOfEmail {
		
		
			   public static boolean isValidEmail(String email) {
				   String regex = "^(.+)@(.+)$";
				 //initialize the Pattern object
			       Pattern pattern = Pattern.compile(regex);
			       Matcher matcher = pattern.matcher(email);
			       return matcher.matches();

			       
			   }

			   public static void main(String[] args) {
			       List<String> emails = new ArrayList<String>();
			       // valid email addresses
			       
			       emails.add("ramu76@gmail.com");
			       emails.add("ramu7998@gmail.com");
			       emails.add("ram@gmai.mm");
			       //invalid email addresses
			       emails.add("lucky.gmail.com");
			       emails.add("amu@gmail.com");
			       emails.add("raja@.gmail.com");

			       for (String value : emails) {
			           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
			       }
			       
			       System.out.println("Enter any email address to check");
			       Scanner sc = new Scanner(System.in);
			       String input = sc.nextLine();
			       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
			       
			   }
			   
	}


