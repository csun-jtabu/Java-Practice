
public class Tester {
	public static void main(String[]args)
	{
		Circle c1 = new Circle(1);
		System.out.println("The radius is currently " + c1.getRadius());
		System.out.println("The area is currently " + c1.getArea());
		System.out.println("The Circumference is currently " + c1.getPerimeter());
		c1.setRadius(5);
		System.out.println("The radius is currently " + c1.getRadius());
	}
}
