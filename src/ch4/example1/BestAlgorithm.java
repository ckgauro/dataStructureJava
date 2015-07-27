package ch4.example1;

public class BestAlgorithm {

	/**
	 * Uses repeated concatenation to compose a String with n copies of
	 * character c.
	 */
	public static String repeat1(char c, int n) {
		long startTime = System.currentTimeMillis(); // record the starting time
		String answer = "";
		for (int j = 0; j < n; j++)
			answer += c;
		long endTime = System.currentTimeMillis(); // record the ending time
		long elapsed = endTime - startTime; // compute the elapsed time
		System.out.println("Repeat1 :" + elapsed);
		return answer;
	}

	/** Uses StringBuilder to compose a String with n copies of character c. */
	public static String repeat2(char c, int n) {
		long startTime = System.currentTimeMillis(); // record the starting time
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < n; j++)
			sb.append(c);
		long endTime = System.currentTimeMillis(); // record the ending time
		long elapsed = endTime - startTime; // compute the elapsed time
		System.out.println("Repeat2 :" + elapsed);
		return sb.toString();
	}

	public static void main(String[] args) {
		BestAlgorithm n=new BestAlgorithm();
		n.repeat1('*', 500000);
		n.repeat2('*', 500000);

	}

}
