package assigment_module;

import java.util.Scanner;

public class Scanner_t {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	/*
	 * byte a= s1.nextByte(); 
	 * short b = s1.nextShort(); 
	 * long c= s1.nextLong(); 
	 * int d= s1.nextInt(); 
	 * double e= s1.nextDouble(); 
	 * boolean f = s1.nextBoolean();
	 * String name = s1.next();
	 *  s1.close();
	 */
	
	System.out.println("please enter value of a");
	int a= s.nextInt();
	System.out.println("please enter value of b");
	int b= s.nextInt();
	int sum = a+b;
	System.out.println("addition of 2 numbers -->");
	System.out.println(sum);
	s.close();
		
		
		
	}

}
