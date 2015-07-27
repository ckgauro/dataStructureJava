package ch5.Recursion;

public class Unique {
	/**
	 * Returns true if there are no duplicate values from data[low] through
	 * data[high].
	 */
	public static boolean unique3(int[] data, int low, int high) {
		if (low >= high)
			return true; // at most one item
		else if (!unique3(data, low, high-1))
			//else if (!unique3(data, low, high - 1))
			return false; // duplicate in first n-1
		else if (! unique3(data, low + 1, high))
			return false; // duplicate in last n-1
		else
			return (data[low] != data[high]); // do first and last differ?
	}

	public static void main(String[] args) {
		System.out.println(Unique.unique3(new int[]{45, 5,33,53,15,4},0,5));

	}

}
