package com.Practice;

public class Practice_Array {

	// 1. calclulate the sum of array of 5 float ...
	public static void main(String[] args) {

		float arr[] = { 10.00f, 25.2f, 33.99f, 45.09f, 99.25f };
		float dup = 25.0f;

		/*
		 * int sum = 0; for (int i = 0; i <= arr.length - 1; i++) {
		 * 
		 * sum = (int) (sum + arr[i]);
		 * 
		 * } System.out.println(sum);
		 */

		// 2. find whether the elemnt is prsent in the array or not..

		boolean isInArray = false;
		for (int i = 0; i <= arr.length - 1; i++) {

			if (dup == arr[i]) {

				isInArray = true;
				break;
			}

		}
		if (isInArray == true) {
			System.out.println("the element is present in array");

		} else {
			System.out.println("the element is not prsent in array");
		}
	}

}
