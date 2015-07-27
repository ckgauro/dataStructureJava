package ch5.Recursion;

public class BinarySum {

	/** Returns the sum of subarray data[low] through data[high] inclusive. */
	public static int binarySum(int[] data, int low, int high) {
		if (low > high) // zero elements in subarray
			return 0;
		else if (low == high) // one element in subarray
			return data[low];
		else {
			int mid = (low + high) / 2;
			return binarySum(data, low, mid) + binarySum(data, mid + 1, high);
		}
	}

	public static void main(String[] args) {
		System.out.println(BinarySum.binarySum(new int[]{45, 5,33,53,5,4},0,5));

	}

}
