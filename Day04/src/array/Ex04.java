package array;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// 1차원 배열
		int[] arr1 = new int[] {10, 20, 30, 40, 50};
		
		// 2차원 배열
		// - 1차원 배열을 요소로 가진다
		int[][] arr2 = new int[][] {
			{ 10, 20, 30, 40 },	// 0행
			{ 11, 21, 31, 41 },	// 1행
			{ 12, 22, 32, 42 }	// 행
		//		0	1	2	3 열
			
		};
		
		
		// 실제 메모리에선 아래 처럼 일렬로 생성됨
		arr2 = new int[][] { {10, 20, 30, 40}, { 11, 21, 31, 41}, {12, 22, 32, 42 } };
		
		System.out.println("arr2 = " + arr2);
		System.out.println("arr[0] = " + Arrays.toString(arr2[0]));
		System.out.println("arr[0][2] = " + arr2[0][2] + "\n");
		// - 쉽게 [행][열]이라고 생각하면 됨
		
		
		// 연습)
		System.out.println("41 = " + arr2[1][3]);
		System.out.println("22 = " + arr2[2][1]);
	}
}
