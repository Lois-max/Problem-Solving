package org.me.learning;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1,2,4,5};
		int sum=0;
		int sum1=0;
		
		//loop through and sum all current numbers.
		for (int i=0; i<a.length;i++) {
			sum=sum+a[i];
		}
		
		//second loop to sum from first num to last num
		for (int j=1; j<=a.length+1;j++) {
		
			sum1=sum1+j;
	}
		System.out.println(sum1-sum);
	}
}
