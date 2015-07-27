package oops.AdvanceObject;

public class MainPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area x=new Triangle(5, 3, 5);
		CallArea y=new CallArea(x, "Trianle");
		y.area();
		y.vol();
		
		x=new Circle(10);
		y=new CallArea(x, "Circle");
		y.area();
		y.vol();
		
		

	}

}
