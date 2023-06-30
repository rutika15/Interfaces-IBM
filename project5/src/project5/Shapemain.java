package project5;

public class Shapemain {
	public static void main(String args[])
	{
		Circle c=new Circle(3.14,4);
		System.out.println(c.getArea());
		Triangle t=new Triangle(5,2);
		System.out.println(t.getArea());
		Rectangle r=new Rectangle(2,3);
		System.out.println(r.getArea());
	}

}
