package ch5.Recursion;

public class LinerSum {
	/** Returns the sum of the first n integers of the given array. */
	public static int linearSum(int[] data, int n) {
		if (n == 0)
			return 0;
		else
			return linearSum(data, n - 1) + data[n - 1];
	}

	public static void main(String[] args) {
		System.out.println(LinerSum.linearSum(new int[]{4, 5,25,10,6},5));

	}

}
