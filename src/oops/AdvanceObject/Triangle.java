package oops.AdvanceObject;

public class Triangle implements Area {

	int l,b,h;
	
	public Triangle(int l,int b,int h) {
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public double area() {
		// TODO Auto-generated method stub
		//int n=0;
		//if (n<=0)
		//	throw new IllegalArgumentException("n value should be positive ");
		return (l*b*h)/2.0;
	}

	public double volume() {
		// TODO Auto-generated method stub
		return (double) l*b*h;
	}
	

}
