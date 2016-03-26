package Example;

import java.util.Random;

import ElementarySorts.Insertion;
import ElementarySorts.Selection;

public class SortCompare {

	static int n = 1000;

	static Random r = new Random(System.currentTimeMillis());

	public static int[] intGen() {
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = r.nextInt(10000);
		}
		return nums;
	}

	public static double timeRandomInput(String alg1) {
		double total = 0.0;
		int m = 1000;
		for (int i = 0; i < m; i++) {
			total += time(alg1);
		}
		return total;
	}

	public static double time(String alg1) {
		Timer timer = new Timer();
		if (alg1.equals("Insertion"))
			Insertion.sort(intGen());
		if (alg1.equals("Selection"))
			Selection.sort(intGen());

		return timer.stop();
	}

	public static void main(String[] args) {
		System.out.println(timeRandomInput("Insertion"));
		System.out.println(timeRandomInput("Selection"));
	}
}
