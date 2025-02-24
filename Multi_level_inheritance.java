package assigment_module;
//WAP to create relation between multiple classes 
//containing both static and non-static methods. Multi Level Inheritance.0

class google{
	void gmail() {
		System.out.println("Non static--> grand parent class");
	}
	static void youtube() {
		System.out.println("Static--> Grand parent class");
	}
	
}
class googleMap extends google{
	void search() {
		System.out.println("Non static--> parent class ");
	}
	static void drive() {
		System.out.println("Static--> Parent class ");
	}
}
public class Multi_level_inheritance extends googleMap {
	void news() {
		System.out.println("Non static--> child class 1");
	}
	static void photos() {
		System.out.println("Static--> child class");
	}
	public static void main(String[] args) {
		
		youtube();
		drive();
		photos();
		
		Multi_level_inheritance m1 = new  Multi_level_inheritance();
		
		m1.gmail();
		m1.search();
		m1.news();
	}

}
