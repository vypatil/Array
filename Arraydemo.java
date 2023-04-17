package Array;

import java.util.Arrays;

public class Arraydemo {

	public static void main(String[] args) {

		int [] number = {10,55,80,70,20};

		Arrays.sort(number);

		for (int i=0 ; i<number.length ; i++) {

			System.out.println(number[i]);

		}
		System.out.println("**********************");
		char [] chrr = new char[4];

		chrr [0]= 'a';
		chrr [1]= 'y';
		chrr [2]= 'x';
		chrr [3]= 'd';

		Arrays.sort(chrr);

		for(int i=0 ; i<chrr.length ; i++) {

			System.out.println(chrr[i]);
		}
		System.out.println("**********************");

		System.out.println(Arrays.toString(chrr));

		System.out.println(Arrays.toString(number));
	}
}
