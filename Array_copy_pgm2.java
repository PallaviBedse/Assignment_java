package assigment_module;

import java.util.Arrays;
import java.util.Scanner;
//WAP on Array of size 4 belong to int type and copy its value into another array

public class Array_copy_pgm2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the array size");
		int rollno[]=new int[s1.nextInt()];
		
		for (int i=0; i<=rollno.length-1;i++)
		{
		  System.out.println("enter the valueof array at index "+i);
		  rollno[i]= s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		
		//creating new array
		int copy_rollno[]=new int [rollno.length];
		
		for(int j = 0 ;j<=copy_rollno.length-1;j++) 
		{
			copy_rollno[j]=rollno[j];
		}
		System.out.println("copied Array:-->");
		System.out.println(Arrays.toString(copy_rollno));
	}

}
