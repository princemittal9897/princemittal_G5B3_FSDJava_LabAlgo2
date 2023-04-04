package com.gl.currenctDenomination.model;

public class SortingService {

	void sort(int[] array) {
		if (array.length <= 1)
			return;
		int mid = array.length / 2;
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];

		for (int i = 0; i < mid; i++)
			left[i] = array[i];
		for (int i = mid; i < array.length; i++)
			right[i - mid] = array[i];

		sort(left);
		sort(right);
		merge(left, right, array);
	}

	private void merge(int[] left, int[] right, int[] array) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length)
			if (left[i] > right[j])
				array[k++] = left[i++];
			else
				array[k++] = right[j++];
		
		while (i < left.length)
			array[k++] = left[i++];
		while (j < right.length)
			array[k++] = right[j++];
	}
	
	
}
