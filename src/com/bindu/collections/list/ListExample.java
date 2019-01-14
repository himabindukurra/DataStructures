package com.bindu.collections.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	@SuppressWarnings("unchecked")
	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		List alist = new ArrayList(Arrays.asList("SSS","KKK","V L","An","Kk","Ash","Bindu", "AAA"));
		alist.add( "Bindu");
		alist.add( "1");
		alist.add( "Himabindu Kurra");
		
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
			add("Pp"); 
			add("Va");
			add("AAA");
			add("Bindu");
			addAll(alist);
			remove("Bindu");
			}};
		
		System.out.println("------------------------------");
		for(Object a : blist){
			System.out.println(a);
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println(blist.indexOf("Bindu"));
		
		blist.set(blist.size()-1, "Bindu");
		
		System.out.println(blist.size());
		
		System.out.println(blist.contains("Diana"));
		
		System.out.println("Using for loop");
		
		for(int counter=0; counter < blist.size(); counter++) {
			System.out.print(blist.get(counter)+" ");
		}
		
		System.out.println();
		
		int counter = 0;
		while(counter < alist.size()) {
			System.out.print(alist.get(counter)+" ");
			counter++;
		}
		
		System.out.println();
		
		System.out.println("Using Iterator");
		
		Iterator itr= alist.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		
		System.out.println("Using Enumerations");
		
		Enumeration e = Collections.enumeration(alist);
		
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
		
		Collections.sort(alist);
		
		System.out.println("After sorting elements");
		
		for(Object a : alist){
			System.out.print(a+" ");
		}
		
		Collections.sort(blist, Collections.reverseOrder());
			
		System.out.println("After sorting blist elements descending order");
		
		for(Object a : blist){
			System.out.print(a+" ");
		}
		
		ArrayList<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(223, "Chaitanya", 26));
		   arraylist.add(new Student(245, "Rahul", 24));
		   arraylist.add(new Student(209, "Ajeet", 32));

		   Collections.sort(arraylist);

		   for(Student str: arraylist){
				System.out.println(str);
		   }
		   
		   System.out.println("Student Name Sorting:");
		   Collections.sort(arraylist, Student.StuNameComparator);

		   for(Student str: arraylist){
				System.out.println(str);
		   }

		   /* Sorting on Rollno property*/
		   System.out.println("RollNum Sorting:");
		   Collections.sort(arraylist, Student.StuRollno);
		   for(Student str: arraylist){
				System.out.println(str);
		   }
		   
		   ArrayList<String> al2 = new ArrayList<String>(alist.subList(1, 4));
		     System.out.println("SubList stored in ArrayList: "+al2);
		
		     List<String> list = blist.subList(1, 4);
		     System.out.println("SubList stored in List: "+list);
		
		     //alist.lastIndexOf("AA");
		     //alist.get(1);
		     //alist.indexOf("V L");
		     
		     //alist.contains("V L");
		     
	}

}
