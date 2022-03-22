package org.test;

public class Palindrome {

	public static void main(String[] args) {

		String s= "9952032397" , n="";
		System.out.println("Original Word "+s);
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			n=charAt+n;


		}
		System.out.println("Reverse Word Is "+n);


	}


}
