package ch5.Recursion;

public class Search {
	/**
	 * Returns true if the target value is found in the indicated portion of the
	 * data array. This search only considers the array portion from data[low]
	 * to data[high] inclusive.
	 */
	public static boolean binarySearch(int[] data, int target, int low, int high) {
		if (low > high)
			return false; // interval empty; no match
		else {
			int mid = (low + high) / 2;
			if (target == data[mid])
				return true; // found a match
			else if (target < data[mid])
				return binarySearch(data, target, low, mid - 1); // recur left
																	// of the
																	// middle
			else
				return binarySearch(data, target, mid + 1, high); // recur right
																	// of the
																	// middle
		}
	}

	public static void main(String[] args) {
		
		System.out.println(Search.binarySearch(new int[]{4,8,15,26,30,45,65,75,77,84,90,95},350,0,11));

	}

}
