package day07;

import java.util.Arrays;

public class MultiArray02 {

	public static void main(String[] args) {
		/* 2차원 배열
		 * 1 2 3
		 * 4 5 6 
		 * 7 8 9
		 * 10 11 12
		 * 13 14 15
		 * 
		 */

		int[][] arr = new int[5][3];
		int upscale = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = upscale;
				upscale++;
 			}
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
	}

}
