package MergeSort;

import Example.Util;

public class Merge {

	private static int[] tmp;

	public static void sort(int[] a) {
		tmp = new int[a.length];
		sort(a, 0, a.length - 1);
	}

	private static void sort(int[] a, int left, int right) {
		if (left >= right)
			return;
		int mid = (left + right) / 2;
		sort(a, left, mid);
		sort(a, mid + 1, right);
		merge(a, left, mid, right);
	}

	private static void merge(int[] a, int left, int mid, int right) {
		if (left < right) {
			for (int z = left; z <= right; z++) {
				tmp[z] = a[z];
			}
			int i = left;
			int j = mid + 1;
			int k = left;
			while (i <= mid && j <= right) {
				if (tmp[i] < tmp[j]) {
					a[k++] = tmp[i++];
				} else {
					a[k++] = tmp[j++];
				}
			}
			while (i <= mid) {
				a[k++] = tmp[i++];
			}
			while (j <= right) {
				a[k++] = tmp[j++];
			}

		}
	}

	public static void main(String[] args) {
		Util.print(Util.a);
		System.out.println();
		sort(Util.a);
		Util.print(Util.a);
	}

}
