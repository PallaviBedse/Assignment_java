package assigment_module;

import java.util.Arrays;
import java.util.Scanner;

//WAP on Array of size 4 belong to int type and accept its input at run time
public class Array_prm1 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter your Array size");
		int empid [] = new int[s1.nextInt()];
		
		for(int i=0;i<=empid.length-1;i++) {
			System.out.println("enter the value of array at index-> " +i);
			empid [i]=s1.nextInt();
		}
		
		System.out.println(Arrays.toString(empid));
         s1.close();
	}

}
