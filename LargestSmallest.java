package org.me.learning;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers= {-2,-0, 8,4,35,56,-39,-33,-33,56};
		int largest=numbers[0];
		int smallest=numbers[0];
		
	for (int i=0; i<numbers.length;i++) {
		
		if(numbers[i]>largest) {
			largest=numbers[i];
		}
		else if(numbers[i]<smallest) {
			smallest=numbers[i];
		}
	}
	System.out.println(largest);
	System.out.println(smallest);
		
	}

}
