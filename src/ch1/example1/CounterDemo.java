package ch1.example1;

public class CounterDemo {

	public static void main(String[] args) {
		System.out.println("Result");
		Counter c; // declares a variable; no counter yet constructed
		c = new Counter(); // constructs a counter; assigns its reference to c
		c.increment(); // increases its value by one
		c.increment(3); // increases its value by three more
		int temp = c.getCount(); // will be 4
		c.reset(); // value becomes 0
		Counter d = new Counter(5);// declares and constructs a counter having
									// value 5
		d.increment(); // value becomes 6
		Counter e = d; // assigns e to reference the same object as d
		temp = e.getCount(); // will be 6 (as e and d reference the same
								// counter)
		e.badReset(c);
		e.goodReset(c);
		
		e.increment(2);
		System.out.println("Before Result:"+e.getCount());
		e.badReset(e);
		System.out.println("After Result:"+e.getCount());
		
		
		/*
		ABC x=new ABC("ear");
		ABC xy=new ABC("eara");
		x.getName("ara");
		xy.getName(" puzzle");
		*/

	}

}
