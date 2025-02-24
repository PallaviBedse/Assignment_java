package assigment_module;

public class Cunstroctor_overloading {

	
	public  Cunstroctor_overloading() {
		int a =10 ;
		int b= 23;
		System.out.println(a+b);
	}
	public  Cunstroctor_overloading(int x, int y) {
		System.out.println(x*y);
	}
	
	public static void main(String[] args) {
		Cunstroctor_overloading c1 = new Cunstroctor_overloading(12,12);
		Cunstroctor_overloading c2 = new Cunstroctor_overloading();
}
}