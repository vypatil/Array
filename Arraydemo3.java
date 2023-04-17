package Array;

import java.util.Arrays;

public class Arraydemo3 {

	public static void main(String[] args) {

		int [] arr1 = {1,4,7,3,2,10,100,80,70,50};
		
		int [] arr2 = {1,4,7,3,2,10,100,80,70,50};
	
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
//		Arrays.sort(arr1, 3, 8);
//		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Arrays.binarySearch(arr1, 5));

		System.out.println(Arrays.equals(arr1, arr2));
		
		System.out.println(arr1==arr2);
		
//		Arrays.fill(arr1, 500);
//		System.out.println(Arrays.toString(arr1));
		
		System.out.println("length of existing array" + arr1.length);
		
		System.out.println("new lenght of existing array " + Arrays.toString(Arrays.copyOf(arr1, 20)));
		

	}

}