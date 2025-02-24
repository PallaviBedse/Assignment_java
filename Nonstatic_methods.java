package assigment_module;

public class Nonstatic_methods {

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

	}

}
