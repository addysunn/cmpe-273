package src;

import java.util.Arrays;

public class Arra {

	int[] arr = { 10, 12, 14, 16, 22, 32, 4, 5, 7, 9 };

	public int arrays() {

		System.out.println("Before sorting\n");

		for (int value : arr) {

			System.out.println("value : " + value);
		}

		int size = arr.length;
		return size;
	}

	public int[] sort() {

		Arrays.sort(arr);

		System.out.println("\nAfter sorting\n");

		for (int value : arr) {

			System.out.println("value : " + value);
		}

		return arr;
	}

	public int search(int var) {

		int a = var;
		sort();
		int b = Arrays.binarySearch(arr, a);
		return b;
	}

}
