package oops.AdvanceObject;

public class Circle implements Area {

	double pi=3.14f,r;
	/**
	 * Circle Constructor
	 * @param r radius value
	 */
	public Circle(double r)
	{
		this.r=r;
	}
	/**
	 * print area of circle
	 */
	public double area() {
		// TODO Auto-generated method stub
		return pi*r*r;
	}

	/**
	 * print volume
	 */
	public double volume() {
		// TODO Auto-generated method stub
		return 4/3.0*pi*r*r;
	}

}
