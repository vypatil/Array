package Array;

import java.util.Arrays;

public class ArrayHighestElement {

	public static void main(String[] args) {
		
			int [] numbers = {10,50,80,100,60,30,5,1,500};
		
			System.out.println(inputarray(numbers));  // call method for highest element
			
			System.out.println(inputarray2(numbers)); // call method for lowest element
			
		}
	
	public static int inputarray (int [] numbers) {	 // method for highest element
		
		Arrays.sort(numbers);
				
		int highelement = numbers[numbers.length-1];
		
		return highelement;
	}

	public static int inputarray2 (int [] num) {  // method for lowest element
		
		Arrays.sort(num);
		
		int lastelement = num [0];
		
		return lastelement;
		
		
	}
}
