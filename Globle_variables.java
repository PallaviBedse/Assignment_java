package assigment_module;

public class Globle_variables {
	//static globle variables are only get in static methods
	
	static int a= 120;
	static int b = 230;
	 static int a1= 234;
	 final static float x= 23.8f;
	 
	   void globle1()
	  {
		  if(a<b)
		  {
			  System.out.println("a is less than b");
		  }if(a1!=x) {
			  System.out.println("a is not equal to x");
			  
		  }
	  }
	   static void globle2()
		  {
			  if(a>b)
			  {
				  System.out.println("a is less than b");
			  }if(a1!=x) {
				  System.out.println("a is not equal to x");
				  
			  }
		  }
	public static void main(String[] args) {
		Globle_variables gv = new Globle_variables();
		globle2();
		gv.globle1();

	}

}
