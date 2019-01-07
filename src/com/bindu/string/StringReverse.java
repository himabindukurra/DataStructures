package com.bindu.string;

public class StringReverse {
	
	public String reverseString(String str) {
		
		if(str.isEmpty()) {
			return  str;
		}else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringReverse s = new StringReverse();
		String result = s.reverseString("Himabindu Kurra");
		System.out.println(result);
	}

}
