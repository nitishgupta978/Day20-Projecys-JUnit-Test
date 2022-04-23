package com.bridgelabz.Regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfRegexTest {
	final static String CAP_LATTER ="^[A-Z].*";
	public static boolean  CheckStartWithCap(String input)  throws Exception {
		
//			if (input.length()==0)
//			{
//				throw new Exception(ExceptionType.CAP_LATTER,"fIRST NAME cannot be empty");
//			}
		
		Pattern pattern = Pattern.compile(CAP_LATTER);
		Matcher matcher = pattern.matcher(input);
		
		if(!matcher.find()) {
			System.out.println("Please Enter First CAP..");
			return false;
		}
		else {
			return true;
		}
	}
public static void Check(int lenght) throws NumberLessThanZero {
	if(lenght==0) {
		throw new NumberLessThanZero("name more than should be zero");
	
	}
}
	final static String DIGIT_ONLY = "(91)?[7-9][0-9]{9}";
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
	
	
	final static String PASSWORD_CHECK ="[A-Z-a-z0-9]+[@,!,@,#,%.$.&.*]+[0-9]";
	public static boolean CheckPreDefinePassWord(String input) {
		
		Pattern pattern = Pattern.compile(PASSWORD_CHECK);
		Matcher matcher = pattern.matcher(input);
		if(!matcher.find()) {
			System.out.println("Please Enter the Vailde the Password");
			return false;
		}
		else {
			return true;
		}
	}
	
	final static String EMAIL_CHECK ="{1}^[a-z0-9]+[/,@,!,@,#,%.$.&.*]+[gmail.com]?";
	public static boolean CheckEmail(String input) {
		
		Pattern pattern = Pattern.compile(EMAIL_CHECK);
		Matcher matcher = pattern.matcher(input);
		if(!matcher.find()) {
			System.out.println("Please Enter the Vailde the Email");
			return false;
		}
		else {
			return true;
		}
		}
	}
	
	
