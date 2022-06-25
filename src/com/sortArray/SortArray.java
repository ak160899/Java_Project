package com.sortArray;

public class SortArray {

	public static void main(String[] args) {

		int arr[] = { 1,2,5,4,3 };

		boolean chk = false;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] < arr[i + 1]) {

				chk = true;

			} else {
				chk = false;
				break;
			}

		}
		if (chk == true) {
			System.out.println("array is in sorted");
		} else {
			System.out.println("array is not in sorted ");
		}
	}
}
