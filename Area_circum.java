package assigment_module;

import module1.Area_Circumference;

public class Area_circum {

	//data        area      circumference
	//square      a*a            4a 
	//triangle   0.5*b*h        a+b+c
	//rectangle    a*b          2*(a+b)  
	//circle     Pi*r*R         2*pi*r
	
	public static void main(String[]arge) {
		Area_Circumference c1 = new Area_Circumference();
               c1.Area_square();
               c1.Area_triangle();
               c1.Area_rectangle();
               c1.Area_circle();
	}
	public void Area_square() {
	
		int a=100;
		int area_square= a*a;
		System.out.println("Area of Square is:" +area_square);
		int circumference_square = 4*a;
		System.out.println("Circumference of Square is:"+ circumference_square);
	}
	
	public void Area_triangle() {
		int b=10,a=12,c=15;
		int h =8;
		double area_triangle= 0.5*b*h;
		System.out.println("Area of Triangle is:" +area_triangle);
		int circumference_triangle= a+b+c;
		System.out.println("Circumference of Triangle is:"+ circumference_triangle);
		}
	public void Area_rectangle() {
		int a=100;
		int b=299;
		int area_rectangle= a*b;
		System.out.println("Area of Rectangle is:" +area_rectangle);
		int circumference_rectangle= 2*(a+b);
		System.out.println("Circumference of Rectangle is:"+ circumference_rectangle);
		}
	public void Area_circle() {
		int r=10;
		float pi = 3.14f;
		double area_circle= pi*r*r;
		System.out.println("Area of Circle is:" +area_circle);
		double circumference_circle= 2*pi*r;
		System.out.println("Circumference of Circle is:"+ circumference_circle);
		
	}

}


