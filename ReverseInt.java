package org.me.learning;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums= 8890;
		int rev=0;
		
		while(nums!=0) {
			rev=rev*10+nums%10;
			nums=nums/10;
		}
		
		System.out.println(rev);
	}

}
