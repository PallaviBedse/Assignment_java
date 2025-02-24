package assigment_module;

import java.util.Arrays;
//WAP to check if 2 given Strings are ANAGRAM
public class String_Anagram {

	public static void main(String[] args) {
	String name ="Top";
	String input2 = "pot";
	String input1 = name.toLowerCase();
	if(input1.length()!=input2.length())
	{
		System.out.println("if given string length is not same "
				+ "then its never e anagram ");
	}else 
	{
		System.out.println("find the anagram");
	char c1[]=	input1.toCharArray();
	char c2[]=	input2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println("After sorting"+ Arrays.toString(c1));
	System.out.println("After sorting"+ Arrays.toString(c2));
	if(Arrays.equals(c1, c2)==true) {
		System.out.println("given String is ANAGRAM");
	}else {
		System.out.println("given String is not ANAGRAM");
	}
		
	}
	
	}

}
