package assigment_module;

import java.util.Scanner;

public class Voting_if_else {
	
	public static void vote()
	{
	Scanner s = new Scanner(System.in);
	System.out.println("enter the age ");
    int age= s.nextInt();
	
	if(age>=18){
		System.out.println("he/she is eligible to vote");
	}else{
		System.out.println("he/she can not eligible to vote");
	}
	
	}

	public static void main(String[] args) {
		vote();
		
	}

}
