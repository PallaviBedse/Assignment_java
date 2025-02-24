package assigment_module;

import java.util.Arrays;
import java.util.Scanner;

//WAP on Array of size 4 belong to int type and copy its value into another array in reverse order
public class Array_copy_reverse {

	public static void main(String[] args) {
		//Scanner s1= new Scanner(System.in); 
		
		int rollno[] = new int[4];
		rollno[0]=102;
		rollno[1]=230;
		rollno[2]=304;
		rollno[3]=340;
		int Revers_rollno[] = new int[4];
		
		for(int i =0 ,j=3; i<=3;i++,j--) 
		{
			Revers_rollno[j]=rollno[i];
		}

		System.out.println("Given Array " +Arrays.toString(rollno) );
		System.out.println("Revers Array "+Arrays.toString(Revers_rollno));
}
	}


