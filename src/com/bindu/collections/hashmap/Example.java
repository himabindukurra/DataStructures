package com.bindu.collections.hashmap;

import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {1,2,3,1,4,6,2,4,5};
		findNumberOfOccurances(a);

	}

	private static void findNumberOfOccurances(int[] a) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> hmap = new HashMap<>();
		
		for(int i : a) {
			
			Integer c = hmap.get(a[i]);
			
			if(hmap.get(a[i]) == null) {
				hmap.put(a[i],1);
			}else {
				hmap.put(a[i],++c);
			}
			
		}
		
		System.out.println(hmap);
		
	}

}
