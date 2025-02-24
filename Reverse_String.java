package assigment_module;

public class Reverse_String {

	public static void main(String[] args) {
		String a  = "java pallavi";
		String  b = "";
		
		for (int i = a.length()-1; i>=0;i--) {
		char c1 = a.charAt(i);
		b = b +c1;
		}
		System.out.println("this is my string " +a);
		System.out.println("this is my reverse string "  +b);
	}
}
