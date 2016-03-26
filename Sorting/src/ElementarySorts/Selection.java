package ElementarySorts;

import Example.Util;

public class Selection {

	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					int tmp = min;
					min = a[j];
					a[j] = tmp;
				}
			}
			a[i] = min;
		}

	}

	public static void main(String[] args) {
		Selection.sort(Util.a);
		Util.print(Util.a);
	}

}
