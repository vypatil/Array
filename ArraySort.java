package Array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int [] myarr = {10,2,90,100,50,5,40,30,1};

		int [] newsortarr = sortAscending(myarr);
		System.out.println(Arrays.toString(newsortarr));
		
		int [] newSecondArr = sortDescending(myarr);
		System.out.println(Arrays.toString(newSecondArr));

	}
	public static int [] sortAscending (int [] num) {

		int temp=0;

		for (int i=0 ; i<num.length ; i++) {

			for (int k=i+1 ; k<num.length ; k++) {

				if (num[i] > num[k]) {

					temp = num[i];

					num[i]=num[k];

					num[k]=temp;
				} 
			}
		}
		return num;

	}
	
	public static int [] sortDescending (int [] arr) {
		
		int temp=0;
		
		for (int i=0 ; i<arr.length ; i++) {
			
			for (int j=i+1 ; j<arr.length ; j++) {
				
				if (arr[i] < arr[j]) {
					
					temp=arr[i];
					
					arr[i]=arr[j];
					
					arr[j]=temp;
					
				}
				
			}
		}
		
		return arr;
		
	}
	
}
