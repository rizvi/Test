package com.rizvi.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int arrayVlaue[][] = { 
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
				};
		
		// Display
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("\t" + arrayVlaue[i][j]);
			}
			System.out.println();
		}

	}

}