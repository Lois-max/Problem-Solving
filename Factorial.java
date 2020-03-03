package org.me.learning;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(FactorialPrint(9));
	}
	
	//A method to contain 
	public static int FactorialPrint(int num) {
		int fact=1;
		 
		for(int i=1; i<=num;i++) {
			fact=fact*i;
			fact++;
		}
		return fact;
	}

}
