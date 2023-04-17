package Array;

import java.util.Arrays;

public class ArrayInstanceOf {

	public static void main(String[] args) {

		Object [] arr = {10,"hello", true, 30.5f, 'c', "hii"};

		System.out.println("length of array ---> "  + arr.length);

		System.out.println("------------------------------------");

		System.out.println(arr[0].getClass().getName());
		System.out.println(arr[1].getClass().getName());
		System.out.println(arr[2].getClass().getName());
		System.out.println(arr[3].getClass().getName());
		System.out.println(arr[4].getClass().getName());
		System.out.println(arr[5].getClass().getName());

		System.out.println("-----------------------------------");

		System.out.println("processing of element of string type");

		for (int i=0 ; i<arr.length ; i++) {

			if(arr[i] instanceof String) {

				System.out.println(arr[i]);
			}
		}
		System.out.println("-----------------------------------");

		System.out.println("getting element of Number type");

		for(int k=0 ; k<arr.length ; k++) {

			if(arr[k] instanceof Number) {

				System.out.println(arr[k]);
			}
		}
	}

}
