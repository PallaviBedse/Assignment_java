package assigment_module;

import java.util.Arrays;

public class String_count_special_char {

	public static void main(String[] args) {
		String Address = "pallavi patil 1234 @#%^!";
          int countOfNum=0;
          int countOfAlph=0;
          int countOfSpaces=0;
          
          char [] c1 = Address.toCharArray();
          System.out.println(Arrays.toString(c1));
          
          for(int i = 0; i<=c1.length-1;i++)
          {
        	  boolean b1 =Character.isDigit(c1[i]);
        	  boolean b2 = Character.isAlphabetic(c1[i]);
        	  boolean b3 = Character.isWhitespace(c1[i]);
        	  
        	  if(b1==true) {
        		  countOfNum++;
        	  }
             if(b2==true) {
            	 countOfAlph++;
        	  }
             if(b3==true) {
            	 countOfSpaces++;
       	      }
          }
          System.out.println("count of Numeric "+countOfNum);
          System.out.println("count of Alphabet "+countOfAlph);
          System.out.println("count of WhiteSpaces "+countOfSpaces);
           
          int specialCharacter = (Address.length()-(countOfNum+countOfAlph+countOfSpaces));
          System.out.println("count of Special Character "+specialCharacter);
          
	}
}
