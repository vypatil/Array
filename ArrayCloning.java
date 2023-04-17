package Array;

import java.util.Arrays;

public class ArrayCloning {
	
	public static void main(String[] args) {
		
		int[] myarray = {10,55,63,1,3,7};
		
		int[] clonningArray = myarray.clone();
		
		System.out.println(Arrays.toString(clonningArray));
		
		System.out.println(clonningArray == myarray);
		
		System.out.println(clonningArray.equals(myarray));
		
	}
}
