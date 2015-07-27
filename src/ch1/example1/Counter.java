package ch1.example1;

public class Counter {
	private int count; // a simple integer instance variable

	public Counter() {
	} // default constructor (count is 0)

	public Counter(int initial) {
		count = initial;
	} // an alternate constructor

	public int getCount() {
		return count;
	} // an accessor method

	public void increment() {
		count++;
	} // an update method

	public void increment(int delta) {
		count += delta;
	} // an update method

	public void reset() {
		count = 0;
	} // an update method
	public void badReset(Counter c)
	{
		//System.out.println(" before  done "+c.getCount());
		//c=new Counter();
		c.count=0;
		
	//	c.increment(10);
	//	System.out.println(" After  done "+c.getCount());
	}
	public void goodReset(Counter c)
	{
		c.reset();
	}
	

}

class ABC
{
	final String aa;
	public ABC(String x)
	{
		aa=x;
	}
	public ABC() {
		// TODO Auto-generated constructor stub
		aa="Ram";
	}
	public void getName(String n)
	{
		System.out.println("Hello"+n+"\t "+aa);
	
	}
}