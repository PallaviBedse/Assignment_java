package assigment_module;

public class GlobalVariable_nonStatic {
	
	int num1=10;
	int num2=20;
	int sum=0;
	static int a=23;
	static int b=12;
	static int result=0;
	
	 void addition() {
		 sum=num1+num2;
		 System.out.println(sum);
	 }
	 static void substraction() {
		result = a-b;
		 System.out.println(result);
	 }
	 
	public static void main(String[] args) {
		GlobalVariable_nonStatic g1 = new GlobalVariable_nonStatic();
		g1.addition();
		substraction();

	}

}
