package ElementarySorts;

import Example.Util;

public class Insertion {

	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int tmp = a[i];
			int j;
			for (j = i - 1; j >= 0 && tmp < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = tmp;
		}
	}

	public static void main(String[] args) {
		Util.print(Util.a);
		System.out.println();
		sort(Util.a);
		Util.print(Util.a);

	}

}
