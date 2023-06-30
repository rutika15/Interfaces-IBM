package project5;

public class Circle implements Shape {
	
	public Circle(double pi, int r) {
		super();
		this.pi = pi;
		this.r = r;
	}



	



	public double pi=3.14;
	public int r;
	
	

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return pi*r*r;
	}



	public double getPi() {
		return pi;
	}



	public void setPi(double pi) {
		this.pi = pi;
	}



	public int getR() {
		return r;
	}



	public void setR(int r) {
		this.r = r;
	}
	
	
	

}
