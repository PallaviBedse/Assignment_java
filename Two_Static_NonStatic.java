package assigment_module;

public class Two_Static_NonStatic {

	public static void multiple () {
    	long a =199999;
    	long b =5676;
    	System.out.println(a*b);
	}

    public static void divison () {
    	int a =120;
    	int b =5;
    	System.out.println(a/b);
    }
    public void addition () {
		int a =122;
		int b =129;
		System.out.println(a+b);
	}
	
    public void substaction () {
    	double a =54.9;
    	double b =23.34;
    	System.out.println(a-b);
	}
	public static void main(String[] args) {
		System.out.println("Calling Non-Static method");
		Nonstatic_methods s= new Nonstatic_methods();
		s.addition();
		s.substaction();

		System.out.println("Calling Static method");
		Static_Method.multiple();
		Static_Method.divison();
		
	}
}
