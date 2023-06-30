package project5;

public class Rectangle implements Shape{
	
	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	public int l,b;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return l*b;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

}
