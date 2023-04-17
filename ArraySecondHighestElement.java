package Array;

import java.util.Arrays;

public class ArraySecondHighestElement {

	public static void main(String[] args) {

		int[] numbers = {10,55,90,100,33,20};

		//		Arrays.sort(numbers);			
		//		
		//		System.out.println(numbers[numbers.length-2]);

		System.out.println(secondHighestElement(numbers));
	}

	public static int secondHighestElement (int[] abc) {

		Arrays.sort(abc);

		int[] emptyarr = new int[abc.length];
		int k=0;

		for(int i=abc.length-1 ; i>=0 ; i--) {

			emptyarr[k]=abc[i];
			k++;

		}
		return emptyarr[1];

	}
}
