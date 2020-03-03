package org.me.learning;

public class StringOnlyDigits {

	public static void main(String[] args) {
		// Working with character sequence
				
		System.out.println(isNumeric("3345545"));
	}
	
	public static boolean isEmpty(CharSequence cs) {
		return cs==null || cs.length()==0;
	}
	
		
	public static boolean isNumeric (CharSequence cs){
		
		if (isEmpty(cs)) {
			return false;
		}
		
		int n=cs.length();
		for (int i=0;i<n;i++) {
			if(!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}return true;
	}

}
