package project5;

public class Triangle implements Shape{
	
	public Triangle(double h, double b) {
		super();
		this.h = h;
		this.b = b;
	}

	public double h,b;

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5*b*h;
	}
	
	

}
