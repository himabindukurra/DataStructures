package com.bindu.operations;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Math {
	
	public static void main (String args[]){
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the 1st number :  ");
	    int num1 = scanner.nextInt();
	    System.out.print("Enter the 2nd number : ");
	    int num2 = scanner.nextInt();

	    ArrayList commonDivisor = getCommonDivisor(num1, num2);
	    System.out.println(commonDivisor);
	}

	public static ArrayList getCommonDivisor(int num1, int num2) {

	    ArrayList list = new ArrayList();

	    int min = minimum(num1, num2);
	    int count=0;

	    for(int i = 1; i <= min / 2; i++) { 
	        if (num1 % i == 0 && num2 % i == 0) {
	            list.add(i);
	            count++;
	        }
	    }
	    
	    if (num1 % min == 0 && num2 % min == 0) {
	        list.add(min);
	        count++;
	    }
	    
	    System.out.println(count);
	    
	    return list;
	}

	public static int minimum(int num1, int num2) {
	    return num1 <= num2 ? num1 : num2;
	}

}
