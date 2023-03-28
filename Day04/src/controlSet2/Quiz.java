package controlSet2;

import java.util.Scanner;

public class Quiz {
	/*
	 	별찍기 문제)
	 	1. N x N 찍기
	 	ex) 입력 : 5
	 
	 	*****
	 	*****
	 	*****
	 	*****
	 	*****
	 	
	 	2. 직각 삼각형
	 	ex) 입력 : 5
	 	
	 	*
	 	**
	 	***
	 	****
	 	*****
	 	
	 	3. 2번을 위 아래 반전
	 	ex) 입력 : 5
	 	
	 	*****
	 	****
	 	***
	 	**
	 	*
	 	
	 	4. 2번을 좌우 반전
	 	ex) 입력 : 5
	 	     *
	   	    **
	   	   ***
	   	  ****
	   	 *****
	   	 
	   	5. 4번을 위 아래 반전
	   	ex) 입력 : 5
	   	
	   	*****
	   	 ****
	   	  ***
	   	   **
	   	    *
	   	   
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("몇 줄? ");
		n = sc.nextInt();
		
		// 1번)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2번)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 3번)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 4번)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - (i + 1); j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 5번)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
