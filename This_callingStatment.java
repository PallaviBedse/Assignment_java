package assigment_module;

class master {
	master(double a, double b){
		System.out.println("this is my grandparent cunstuctor");
		System.out.println(a+b);
	}
}
class facebook extends master{
	
	facebook(int a, int b) {
		super(1.23,2.22);
		System.out.println(a+b);
	}
	facebook(String pallavi) {
		this(12,34);
		System.out.println("Pallavi");
	}
	facebook() {
		this("Pallavi");
		System.out.println("this is my parent cunstuctor");
	}
	
}

public class This_callingStatment extends facebook  {
	This_callingStatment(int a)
	{
	   System.out.println("this is my child cunstuctor2");	
	}
	This_callingStatment()
	{
		this(10);
    System.out.println("this is my child cunstuctor");	
	}
	
	public static void main(String[] args) {
		This_callingStatment t1 = new This_callingStatment();
	}

}
