package assigment_module;

public class Math_class_methods {

	public static void main(String[] args) {  
		System.out.println("addition of 2 int numbers");
		System.out.println(Math.addExact(12,22));
		System.out.println("substrction of 2 int numbers");
		System.out.println(	Math.subtractExact(11,22));
		System.out.println("Multiplication of 2 int numbers");
		System.out.println(	Math.multiplyExact(22,22));
		System.out.println("Max of 2 int numbers");
		System.out.println(	Math.max(11,33));
		System.out.println("dicrement");
		System.out.println(	Math.decrementExact(12));
		System.out.println("divition of 2 int numbers");
		System.out.println(	Math.divideExact(100, 10));
		System.out.println("random number");
		System.out.println(Math.random());
		System.out.println("absulate value");
		System.out.println(Math.abs(12));
		System.out.println(Math.acos(1.9));
		
    int m = Math.max(11,33);;
	System.out.println(m);
				
	double f = Math.nextUp(5.5);
	System.out.println(f);
		
		

}
}