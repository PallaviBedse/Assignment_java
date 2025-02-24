package assigment_module;
//WAP to create relation between 2 classes having static methods using extends keyword. Single Level Inheritance.
 class inheritance1{
	 
	 static void Animal()
	 {
		 System.out.println("This is my first method in parent class");
	 }
	 static void wildAnimal()
	 {
		 System.out.println("This is my second method in parent class");
	 }
}
public class Single_level_inheritance extends  inheritance1{
	
	static void dog() 
	{
    System.out.println("This is my first method in child class");
	}

	public static void main(String[] args) {
		
		//Single_level_inheritance s1 = new Single_level_inheritance();
		dog();
		Animal();
		wildAnimal();
		
	}

}
