package com.bridgelabz.fellowshipprograms.AlgorithnPrograms;

public class MergeSort {
	int array[];
	int mergeArray[];
	int length;

	public void sort(int arr[]) {
		this.array = arr;
		this.length = arr.length;
		this.mergeArray = new int[length];
		divideArray(0, length - 1);
	}

	public void divideArray(int lo, int hi) {
		if (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			divideArray(lo, mid); 			// sort left side of the array
			divideArray(mid + 1, hi);		// sort right side of the array
			mergeArray(lo, mid, hi);
		}
	}

	public void mergeArray(int lo, int mid, int hi) {
		for (int i = lo; i <= hi; i++) {
			mergeArray[i] = array[i];
		}
		int i = lo;
		int j = mid + 1;
		int k = lo;
		while (i <= mid && j <= hi) {
			if (mergeArray[i] <= mergeArray[j]) {
				array[k] = mergeArray[i];
				i++;
			} else {
				array[k] = mergeArray[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			array[k] = mergeArray[i];
			k++;
			i++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 28, 17, 26, 9, 30, 11, 21 };
		MergeSort ms = new MergeSort();
		ms.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
