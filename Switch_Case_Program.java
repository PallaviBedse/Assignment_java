package assigment_module;

import java.util.Scanner;

public class Switch_Case_Program {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Select value 1 the Amazon is open");
		System.out.println("Select value 2 the firstcry is open");
		System.out.println("Select value 3 the flipcart is open");
		System.out.println("Select value 4 the nykaa is open");
		int input = s1.nextInt();
		switch(input) {
		case 1: 
			System.out.println("Amazon");
			break;
		case 2: 
			System.out.println("firscry");
			break;
		case 3: 
			System.out.println("flipcart");
			break;
		case 4: 
			System.out.println("nykaa");
			break;
		default:
				System.out.println("selected value is wrong");
				break;
			
		}
	}

}
