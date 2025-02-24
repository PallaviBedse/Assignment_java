package assigment_module;

import java.util.Arrays;

public class String_count_alphabet {

	public static void main(String[] args) {
		String name = "pallavi Patil 123";
		int countOfAlpha = 0;
		
		char[] c1 = name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i =0 ; i<=c1.length-1; i++) {
		boolean b1 =	Character.isAlphabetic(c1[i]);
		
		if(b1==true) {
			
			countOfAlpha++;
		}
		}

		System.out.println("count of alphabet "+countOfAlpha);
	}

}
