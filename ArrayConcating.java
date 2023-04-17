package Array;

import java.util.Arrays;

public class ArrayConcating {

	public static void main(String[] args) {

		int [] arr1 = {20,1,7,3,2,10};
		int [] arr2 = {8,5,9,15};
		
		int[] finalArray = concatArray(arr1,arr2);			
		System.out.println(Arrays.toString(finalArray));
				
	}
	
	public static int[] concatArray (int[]a , int[]b) {
		
		int temp=0;
		
		int[] result = new int[a.length + b.length];
		
		for(int i=0 ; i<result.length ; i++) {
			
			if(i <= a.length-1) {
				
				result[i]=a[i];
			}
			else {
				
				result[i]=b[temp];
				
				temp++;
			}
		}
		
		return result;
	}
	
}
