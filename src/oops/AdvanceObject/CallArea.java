package oops.AdvanceObject;

public class CallArea {
	Area x;
	String name;
	/**  CallArea constructor */
	CallArea(Area x,String name)
	{
		this.x=x;
		this.name=name;
	}
	/**
	 * area called  from CallArea
	 */
	void area()
	{
		System.out.println("Area of "+name+"="+ x.area());
	}
	/**
	 * volme called from CallArea
	 */
	void vol()
	{
		System.out.println("Vloume of "+name+"="+x.volume());
	}

}
