package com.day1;

public class MultiDimensinal_array {

	public static void main(String[] args) {

		int arr[][] = new int[2][3];

		arr[0][0] = 101;
		arr[0][1] = 102;
		arr[0][2] = 103;

		arr[1][0] = 104;
		arr[1][1] = 105;
		arr[1][2] = 106;
		
		
		

		int ar[][] = { { 10, 20, 30 }, { 40, 50, 60 } };

		System.out.println(ar.length);

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length; j++) {

				System.out.print(arr[i][j]-ar[i][j]+" ");
			}
			
			System.out.print("\n");

		}

		int a=Math.addExact(1, 2);
		System.out.println(a);
	}

}
