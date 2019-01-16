package com.bindu.array;

import java.util.Arrays;

public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removingDuplicates(new int[] {1,1,2,3,4,3,4});
		

	}

	private static void removingDuplicates(int[] is) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(is));
		int[] out = new int[is.length];
		
		Arrays.sort(out);
		System.out.print(Arrays.toString(out));
		
		int count=0;
		int in= is[0];
		
		for(int i=0; i< is.length; i++) {
			
			if(is[i]==in) {
				
				continue;
				
			}else {
				out[i] = is[i];
			}
			
			
			
		}
		
	}

}
