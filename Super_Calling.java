package assigment_module;
//WAP to implement super calling statement (parameterized and non parameterized) 
class Amazon{
	 Amazon(){
		 System.out.println("this is my non parameterized constructor");
	 }
	 Amazon(int a ,int b){
		 System.out.println("this is my parameterized constructor");
	 }
}
public class Super_Calling extends Amazon{
	
	Super_Calling(){
		super();
		System.out.println("this is my child class constructor 1");
	}
	Super_Calling(int x){
		super(11,11);
		System.out.println("this is my child class constructor with parameters");
	}

	public static void main(String[] args) {
	new Super_Calling();
	new Super_Calling(2);
	}

}
