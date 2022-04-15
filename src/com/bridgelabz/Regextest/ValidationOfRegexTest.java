package com.bridgelabz.Regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfRegexTest {
	final static String CAP_LATTER ="^[A-Z].*";
	public static void  CheckStartWithCap(String input) {
		
		Pattern pattern = Pattern.compile(CAP_LATTER);
		Matcher matcher = pattern.matcher(input);
		
		if(!matcher.find()) {
			System.out.println("Please Enter First CAP..");
		}
}
	final static String DIGIT_ONLY = "{1}[6-9]+[0-9]{9}/z";
	public static boolean CheckAllDigit(String input) {
		
		Pattern pattern = Pattern.compile(DIGIT_ONLY);
		Matcher matcher = pattern.matcher(input);
		
		if(!matcher.find()) {
			System.out.println("Please Enter Valid Digit Mobile Number:");
			return false;
		}
		else {
			return true;
		}
	}
	
	
	final static String PASSWORD_CHECK ="{1}[A-Z]+[a-z]+[@,!,@,#,%.$.&.*]+[0-9]";
	public static void CheckPreDefinePassWord(String input) {
		
		Pattern pattern = Pattern.compile(PASSWORD_CHECK);
		Matcher matcher = pattern.matcher(input);
		if(!matcher.find()) {
			System.out.println("Please Enter the Vailde the Password");
		}
	}
	final static String EMAIL_CHECK ="{1}^[a-z]+[0-9]+[/,@,!,@,#,%.$.&.*]+gmail.com";
	public static void CheckEmail(String input) {
		
		Pattern pattern = Pattern.compile(EMAIL_CHECK);
		Matcher matcher = pattern.matcher(input);
		if(!matcher.find()) {
			System.out.println("Please Enter the Vailde the Email");
		}
	}
	
	
}
