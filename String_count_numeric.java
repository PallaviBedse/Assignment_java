package assigment_module;

import java.util.Arrays;

public class String_count_numeric {

	public static void main(String[] args) {
		
		String  address = "plot no. 799, cidco";
		int countOfNumeric=0;
		
		char []c1 = address.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i= 0 ; i<=c1.length-1;i++) {
		boolean b1=	Character.isDigit(c1[i]);
		 //System.out.println(b1);
		
     if(b1==true) {
    	 countOfNumeric++;
         }
     }
		 System.out.println("count of numeric "+countOfNumeric);
     }
	}


