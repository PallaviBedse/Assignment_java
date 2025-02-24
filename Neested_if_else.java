package assigment_module;

import java.util.Scanner;

public class Neested_if_else {
	
	public static void student() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the a ");
	    int a= s.nextInt();
	    System.out.println("enter the b ");
	    int b= s.nextInt();
	    System.out.println("enter the c ");
	    int c= s.nextInt();
		//int a= 100;
		//int b=200;
		//int c=200;
		
		if(a<b) {
			System.out.println("a is less than b");
		
			if(b>a) {
				System.out.println("b is greater than a");
			
				if(b==c) {
					System.out.println("b is equal tto c");
					
				}else {
					System.out.println("condition is false");
					}
			}else {
				System.out.println("condition is false");
				}
		}else {
			System.out.println("condition is false");
			
		}
	}
	
	

	public static void main(String[] args) {
	student();
}}
