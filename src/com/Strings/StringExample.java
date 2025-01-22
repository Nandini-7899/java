package com.Strings;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		String s1="Hello";
		System.out.println(s1);
		String s2="livetech@gmail.com";
		System.out.println(s2);
		System.out.println(s1+s2);
		
		String s3="Hello";
		String s4=new String("Hello");
		String s5="Hello";
		String s6=new String("Hello");
		
		System.out.println(s3==s4);//false
		System.out.println(s3==s5);//true
		System.out.println(s3==s6);//false
		System.out.println(s4==s6);//false
		
		//equals()
		System.out.println(s3.equals(s4));//true
		
		
		//split()
				String s12="Th@is i@s$m#y c@l#as@s";
				//System.out.println(s13.split("@"));//[Ljava.lang.String;@77556fd
				System.out.println(Arrays.toString(s12.split("\\@,$")));

				
				String s13 = "Th@is i@s$m#y c@l#as@s";
				String specialChars = "";

				for (char c : s13.toCharArray()) {
				    if (!Character.isLetterOrDigit(c)) {
				        specialChars += c;
				    }
				}

				System.out.println("Special characters: " + specialChars);
		
	}

}
