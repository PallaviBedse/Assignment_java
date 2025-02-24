package assigment_module;

import java.util.Scanner;

//WAP Regarding coditional Statement Using If  
//With All Logical Operators Present Till Now
//&& T T   T    T   ||
//   T F   F    T
//   F T   F    T
//   F F   F    F
     
 
public class Conditional_stetment {
	
	
	public void AND_oprator() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter value of a");
		int a= s.nextInt();
		System.out.println("please enter value of b");
		int b= s.nextInt();
		System.out.println("please enter value of c");
		int c= s.nextInt();
		
		//int a=10 ,b=20,c=30;
		System.out.println("AND oprator");
		if(( a <  b) && ( b < c)) {
			System.out.println("condition is true");
		 
		}else 
		{
			System.out.println("condition is false");
				}
		}
	
	public void OR_oprator() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("please enter value of a");
		int a= s.nextInt();
		System.out.println("please enter value of b");
		int b= s.nextInt();
		System.out.println("please enter value of c");
		int c= s.nextInt();
		
		//int a=10 ,b=20,c=30;
		System.out.println("OR oprator");
		if(( a <  b) || ( b < c)) {
			System.out.println("condition is true");
		 
		}else 
		{
			System.out.println("condition is false");
				}
		}
public void NOT_oprator() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("please enter value of a");
		int a= s.nextInt();
		System.out.println("please enter value of b");
		int b= s.nextInt();
		
		
		//int a=10 ,b=20,c=30;
		System.out.println("NOT oprator");
		
		if(!(a<b)) {
			System.out.println("condition is true");
		 
		}else 
		{
			System.out.println("condition is false");
				}
		}
	
	public static void main(String[] args) {
		
		Conditional_stetment s1 = new Conditional_stetment();
		s1.AND_oprator();
		s1.OR_oprator();
		s1.NOT_oprator();
	}

}
