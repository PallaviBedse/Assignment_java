package assigment_module;

public class Static_Method {
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
	public static void main(String[] args) {

		System.out.println("Calling Static method");
		Static_Method.multiple();
		Static_Method.divison();
		

	}

}
