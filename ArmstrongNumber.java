package org.me.learning;

public class ArmstrongNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isArmStrong(898);
	}
	
	public static void isArmStrong(int num) {
	
		int cube=0;
		int r=0;
		int t=num;
		
		r=num%10;
		num=num/10;
		cube= cube +(r*r*r);
		
		if (cube==t) {
			System.out.println("It is an armstrong number");
		}
		else {
			System.out.println("It isn't an armstrong number");
		}
	}

}
