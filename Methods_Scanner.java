package assigment_module;
//scanner class methods
import java.util.Scanner;

public class Methods_Scanner {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		//s1.close();
		//s1.next();
	    //s1.nextByte();
	    //s1.nextBoolean();
		//s1.nextFloat();
	    //s1.nextDouble();
		//s1.nextByte();
	    //s1.nextInt();
		System.out.println("please enter value of a");
		int a= s1.nextInt();
		System.out.println("please enter value of b");
		int b= s1.nextInt();
		int sum = a+b;
		System.out.println("addition of 2 numbers -->");
		System.out.println(sum);
		s1.close();
	}

}
