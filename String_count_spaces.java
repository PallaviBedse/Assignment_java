package assigment_module;

import java.util.Arrays;

public class String_count_spaces {

	public static void main(String[] args) {
	String address = "Antara's nest baner pune 430016";
	int countOfWhiteSpaces=0;
	
	
	char [] c1 = address.toCharArray();
	System.out.println(Arrays.toString(c1));
	
	for(int i = 0 ; i<=c1.length-1; i++) {
		boolean b1 = Character.isWhitespace(c1[i]);
		//boolean b2 = Character.isLetter(4);
		//System.out.println(b2);
		if(b1== true) {
			countOfWhiteSpaces++;
		}
	}
	System.out.println("count white spaces "+countOfWhiteSpaces);
	}

}
