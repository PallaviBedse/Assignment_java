package assigment_module;

public class Method_Overloading {

	public void addition() {
		int a =10 ;
		int b=23;
		System.out.println(a+b);
	}
	public void addition(int x, int y) {
		System.out.println(x*y);
	}
	
	public static void main(String[] args) {
		
		Method_Overloading m=new Method_Overloading();
		m.addition();
		m.addition(245, 2);
	}

}
