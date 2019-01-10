package com.bindu.collections.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

	@SuppressWarnings("unchecked")
	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		List alist = new ArrayList(Arrays.asList("Swaroop","Kumari","Vijaya Lakshmi","Anil","Karthik","Ashrita","Bindu", "Anvesh"));
		alist.add( "Bindu");
		alist.add( "1");
		alist.add( "Himabindu Kurra");
		//alist.addAll( "Swaroop","Kumari","Vijaya Lakshmi","Anil","Karthik","Ashrita","Bindu", "Anvesh");
		
		// alist.add(true);
		
		//after insertions of various elements
		System.out.println("------------------------------");
		System.out.println("After Insertion of an element with index");
		for(Object a:alist) {
			System.out.println(a);
		}
		
		alist.add(1, "Hima");
		System.out.println("------------------------------");
		System.out.println("\n After Insertion of an element with index");
		for(Object a:alist) {
			System.out.println(a);
		}
		
		alist.remove("Bindu");
		System.out.println("------------------------------");
		System.out.println("\n After deletion of an element");
		for(Object a:alist) {
			System.out.println(a);
		}
		
		
		//anonymous class
		List blist = new ArrayList() {{
			add("Prathap"); 
			add("Vasantha");
			add("Anvesh");
			add("Bindu");
			addAll(alist);
			remove("Bindu");
			}};
		
		System.out.println("------------------------------");
		for(Object a : blist){
			System.out.println(a);
		}
		
	}

}