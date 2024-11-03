import java.util.Scanner;
class Shape {
	void area(float base,float height) {
	double  area=0.5*base*height;
		System.out.println("Area of Triangle:"+area);
	}
	void area(float radius) {
		double area= 3.14*radius*radius;
		System.out.println("Area of circle:"+area);
		
	}
	void area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle:"+area);
	}
	
}
public class Methodoverloading{
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the base:");
	float base=sc.nextFloat();
	System.out.println("enter the height:");
	float height=sc.nextFloat();
	System.out.println("enter the radius:");
	float radius=sc.nextFloat();
	System.out.println("enter the length:");
	int length=sc.nextInt();
	System.out.println("enter the breadth:");
	int breadth=sc.nextInt();
	Shape s=new Shape();
	s.area(radius);
	s.area(length, breadth);
	s.area(base, height);
	}}
	
	
	
	


