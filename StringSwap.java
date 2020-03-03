package org.me.learning;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Alabama";
		String b="Johannesburg";
		
		a=a+b; //AlabamaJohannesburg
		System.out.println(a);
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
	System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
	}

}
