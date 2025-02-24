package assigment_module;

public class Local_variable {
	
   static void local1(){
	int x= 100;
	int y = 333;
	int z= x*y;
	System.out.println(z);
	 }
   void local2() {
	   int a=10;
	   int b=23;
	   System.out.println(a+b);
	   
   }
   
	public static void main(String[] args) {
		Local_variable lb = new Local_variable();
		lb.local2();
	    local1();

	}

}
