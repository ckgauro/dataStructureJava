package ch5.Recursion;

import java.io.File;

public class DiskUsage {
	/**
	 * Calculates the total disk usage (in bytes) of the portion of the file
	 * system rooted at the given path, while printing a summary akin to the
	 * standard 'du' Unix tool.
	 */
	public static long diskUsage(File root) {
		long total = root.length(); // start with direct disk usage
		if (root.isDirectory()) { // and if this is a directory,
			for (String childname : root.list()) { // then for each child
				File child = new File(root, childname); // compose full path to
														// child
				total += diskUsage(child); // add child’s usage to total
			}
		}
		System.out.println(total + "\t" + root); // descriptive output
		return total; // return the grand total
	}

	public static void main(String[] args) {
		File f=new File("D:/Personal/MonthlyOneToOne");
		System.out.println(DiskUsage.diskUsage(f));

	}

}
