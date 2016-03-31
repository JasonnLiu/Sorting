package HeapSort;

import Example.Util;

public class Heap {

	private static void exch(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	private static int leftC(int k) {
		return 2 * k + 1;
	}

	private static int parent(int k) {
		return (k - 1) / 2;
	}

	private static void swim(int[] a, int k) {
		int tmp = a[k];
		while (k >= 1) {
			if (tmp > a[parent(k)]) {
				a[k] = a[parent(k)];
				k = parent(k);
			} else {
				break;
			}
		}
		a[k] = tmp;
	}

	private static void sink(int[] a, int end, int k) {
		int tmp = a[k];
		while (leftC(k) <= end) {
			int maxC;
			if (leftC(k) + 1 <= end && a[leftC(k)] < a[leftC(k) + 1]) {
				maxC = leftC(k) + 1;
			} else {
				maxC = leftC(k);
			}
			if (tmp < a[maxC]) {
				a[k] = a[maxC];
				k = maxC;
			} else {
				break;
			}
		}
		a[k] = tmp;
	}

	public static void sort(int[] a) {
		heapCreate(a);
		for (int i = 0; i < a.length - 1; i++) {
			sortByDelMax(a, i);
		}

	}

	private static void sortByDelMax(int[] a, int sorted) {
		int end = a.length - 1 - sorted;
		exch(a, 0, end);
		end = end - 1;
		if (end == 0)
			return;
		sink(a, end, 0);

	}

	private static void heapCreate(int[] a) {
		for (int i = parent(a.length - 1); i >= 0; i--) {
			sink(a, a.length - 1, i);
		}
	}

	public static void main(String[] args) {
		Util.print(Util.a);
		System.out.println();
		sort(Util.a);
		Util.print(Util.a);
	}

}
