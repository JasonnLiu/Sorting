package ElementarySorts;

import Example.Util;

public class Shell {

	public static void sort(int[] a) {
		int len = a.length;
		int h = 1;
		while (h <= len / 2)
			h = h * 3 + 1;//h的递增序列是影响shellsort的重要因素
		while (h >= 1) {
			int i;
			for (i = h; i < len; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
			}
			h = h / 3;
		}
	}

	public static void main(String[] args) {
		Util.print(Util.a);
		System.out.println();
		sort(Util.a);
		Util.print(Util.a);
	}

}
