package assigment_module;

public class Palindrome_Program {

	public static void main(String[] args) {
		String input = "madam";
		String output ="";
		
		for (int i=input.length()-1; i>=0;i--) {
		char c1 = input.charAt(i);
		//System.out.println(c1);
		output = output+c1;
		
		}
		System.out.println(output);
		if(input.equals(output)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
	
	}
	}
}
