import java.util.*;
abstract class Shape{
double dim1,dim2;
	Shape(double a,double b){
		dim1=a;
		dim2=b;
	}
	abstract void Area();
}
class Rectangle1 extends  Shape{
	Rectangle1(double a,double b){
		super(a,b);
		}
	void Area() {
			System.out.println("The area of the Rectangle:"+(dim1*dim2));
		}
	}
class Triangle extends  Shape{
	Triangle(double a,double b){
			super(a,b);
	}
	void Area() {
		System.out.println("The area of the tringle:"+(0.5*dim1*dim2));
	}
}
class Circle extends  Shape{
	Circle(double a,double b){
			super(a,b);
	}
	void Area() {
		System.out.println("The area of the circle :"+(3.14*dim1*dim2));
	}
}
public class Lab9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("\t\tFind:\n1.Area of Rectangle\n2.Area of triangle"
					+ "\n3.Area of circle");
			int choice;
			double a,b;
			System.out.print("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
						System.out.println("Enter the length:");
						a=sc.nextDouble();
						System.out.println("Enter the breath:");
						b=sc.nextDouble();
						Rectangle1 r=new Rectangle1(a,b);
						r.Area();
						break;
				case 2:
					System.out.println("Enter the base:");
					a=sc.nextDouble();
					System.out.println("Enter the height:");
					b=sc.nextDouble();
					Triangle t=new Triangle(a,b);
					t.Area();
					break;
				case 3:
					System.out.println("Enter the radius of the circle:");
					a=sc.nextDouble();
					Circle c=new Circle(a,a);
					c.Area();
					break;
				default:

					System.out.println("Wrong Choice");
					break;
				}
			sc.close();


     }
}