package assigment_module;
//WAP to create relation between 2 classes having non-static methods using extends keyword. Single Level Inheritance.
 class inheritance2{
	 
	 void google()
	 {
		System.out.println("Single level inheritance with non static methods");
		 
	 }
	
	 void microsoft() {
		 System.out.println("My second method is Microsoft");
		 
	 }
}
public class Single_level_inheritance2 extends inheritance2 {
void amazon() {
	System.out.println("my child class static methods");
	 
}
	public static void main(String[] args) {
		Single_level_inheritance2 s1 = new Single_level_inheritance2();
		s1.amazon();
		s1.microsoft();
		s1.google();

	}

}
