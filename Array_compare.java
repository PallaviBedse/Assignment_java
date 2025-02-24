package assigment_module;

import java.util.Arrays;
//WAP to accept the values of 2 array at run time and compare if they are equals
public class Array_compare {

	public static void main(String[] args) {
		int array1[]= new int[4];
		int array2[] = new int[4]; 
	 	
		array1[0] =12;
		array1[1] =23;
		array1[2] =34;
		array1[3] =41;
		
		array2[0] =12;
		array2[1] =23;
		array2[2] =34;
		array2[3] =47;
		
		System.out.println("the first Array is--> "+Arrays.toString(array1));
		System.out.println("the second Array is--> "+Arrays.toString(array2));
		boolean ans = Arrays.equals(array1,array2);
		if(ans == true) {
			System.out.println("Arrays are Equals");
		}else {
			System.out.println("Arrays are not Equals");
		}

	}

	
}
