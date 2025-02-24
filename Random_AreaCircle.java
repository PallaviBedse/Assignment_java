package assigment_module;

//WAP using For Loop to achieve 5 random results for both Area & Circumference of Circle
public class Random_AreaCircle {

	/*
	 * public void Area_circle() { int r=10; float pi = 3.14f; double area_circle=
	 * pi*r*r; System.out.println("Area of Circle is:" +area_circle); double
	 * circumference_circle= 2*pi*r;
	 * System.out.println("Circumference of Circle is:"+ circumference_circle);
	 * 
	 */
		public void Circle() {
			//double r1= Math.random();
			float pi= 3.14f;
			double circumference_circle;
			
			System.out.println("Area of circle : ");
			for(double r= Math.random();r<=5;r++) 
			{
				double area_of_Circle=pi*r*r;
				System.out.println(area_of_Circle);
			}
			
			System.out.println("Circumference of circle : ");
			for(double r= Math.random();r<=5;r++) 
			{
				 circumference_circle= 2*pi*r;
				System.out.println(circumference_circle);
				 
			}
			
		}
	
	public static void main(String[] args) {
	
		Random_AreaCircle r1 = new Random_AreaCircle();
		r1.Circle();

	}

}