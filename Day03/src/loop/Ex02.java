package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// 1. 구구단 2단을 반복으로 출력. 단, x1 ~ x9까지만
		// 2. 1번을 입력문으로 바궈서 입력한 단어 출력
		// 3. 역순으로 출력
		
		// 1
		int i = 1, dan;
		while (i <= 9) {
			System.out.printf("2 * %d = %d\n", i, 2 * i);
			i++;
		}
		System.out.println();
		
		// 2
		Scanner sc = new Scanner(System.in);
		i = 1;
		
		System.out.print("몇 단? ");
		dan = sc.nextInt();
		
		while (i <= 9) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			i++;
		}
		System.out.println();
		
		i = 9;
		while (i >= 1) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			i--;
		}
	}
}
