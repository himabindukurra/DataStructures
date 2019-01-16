package com.bindu.array;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] in = new int[]{1,2,3,4,5,6,7,8,10};
		
		//int missing = getMissingNumber(in, 10);
		
		//System.out.printf("Missing number in array %s is %d %n ", 
          //      Arrays.toString(in), missing);
	
		printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
		 
       /* 
		// two missing number
      
		printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
 
        // three missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
 
        // four missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
 
        // Only one missing number in array
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", 
                           Arrays.toString(iArray), missing);
                           
           */
    }
 
    private static void printMissingNumber(int[] numbers, int count) {
    	
        int missingCount = count - numbers.length;
        System.out.println(missingCount);
        
        BitSet bitSet = new BitSet(count);
        System.out.println(bitSet);
        
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        
        System.out.println(bitSet);
        
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
        Arrays.toString(numbers), count);
        
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }

	private static int getMissingNumber(int[] numbers, int totalCount) {
		// TODO Auto-generated method stub
		
		int expectedSum = (totalCount * (totalCount + 1)) / 2; 
		//System.out.println("expectedSum "+expectedSum);
		int actualSum = 0; 
		for (int i : numbers) 
		{ 
			actualSum += i; 
		} 
		//System.out.println("actualSum "+actualSum);
		return expectedSum - actualSum;

		}

}
