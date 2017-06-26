package Assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String revstr = "";
		System.out.println("enter the input string");
		Scanner sc = new Scanner(System.in);
		String orig = sc.nextLine();
		
		for(int i = orig.length()-1; i>=0;i--){
			revstr= revstr+ orig.charAt(i);
			
		
			 
		 }
		 if (orig.equals(revstr)){
			 
		  System.out.println("palindrome string");
		 }
			 else
				 System.out.println("not a palindrome string");

	}

}
