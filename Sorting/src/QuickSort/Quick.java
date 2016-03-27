package QuickSort;

import Example.Util;

public class Quick {

	public static void sort(int[] a) {
		sort(a, 0, a.length-1);
	}

	private static void sort(int[] a, int left, int right) {
		if (left >= right)
			return;
		int j = partition(a, left, right);
		sort(a, left, j - 1);
		sort(a, j + 1, right);
	}

	private static int partition(int[] a, int left, int right) {
		mid3(a, left, right);
		int i = left;
		int j = right - 1;
		while (i < j) {
			while (i < j && a[++i] <= a[right - 1]) {
			}
			while (i < j && a[--j] >= a[right - 1]) {
			}
			if (i < j) {
				exch(a, i, j);
			}
		}
		exch(a, i, right - 1);
		return i;
	}

	private static void mid3(int[] a, int left, int right) {
		int mid = (left + right) >> 1;
		if (a[left] > a[mid]) {
			exch(a, left, mid);
		}
		if (a[mid] > a[right]) {
			exch(a, mid, right);
		}
		if (a[left] > a[mid]) {
			exch(a, left, mid);
		}
		exch(a, mid, right - 1);

	}

	private static void exch(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main(String[] args) {
		Util.print(Util.a);
		System.out.println();
		sort(Util.a);
		Util.print(Util.a);
	}

}
