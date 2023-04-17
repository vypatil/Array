package Array;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
			
		int [] myarr = {10,50,60,55,30,2,1};
		
			
		int i=0 , j=myarr.length-1 ,temp ;
		
		while (i<j) {
			
			temp = myarr[i];
			
			myarr[i] = myarr[j];
			
			myarr[j] = temp;
			
			i++;
			j--;
			
		}
		
		System.out.println(Arrays.toString(myarr));
	}
	
	
		
	}

