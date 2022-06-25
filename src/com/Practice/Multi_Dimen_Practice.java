package com.Practice;

public class Multi_Dimen_Practice {
	
	public static void main(String[] args) {
		
		// 12 14 16 
		// 18 20 22
		// 24 28 30
		
		int arr[][]= {{6,7,8},{9,10,11},{12,14,15}};
		
		System.out.println(arr.length);
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=0;j<=arr.length-1;j++) {
				
				System.out.print(arr[i][j]+arr[i][j]+" ");
				
			}
			System.out.print("\n");
		}
		
		
		
		
		
	}

}
