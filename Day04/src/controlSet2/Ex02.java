package controlSet2;

public class Ex02 {
	public static void main(String[] args) {
		// 1. 구구단 2단을 단일 반복으로 출력한다. 단 x1 ~ x9까지만
		// 2. 1번을 중첩 반복으로 바꿔 2단을 8번 출력한다
		// 3. 2번을 조금 수정해서 구구단 2단 ~ 9단까지 출력한다
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 X %d = %d\n", i, 2 * i);
		}
		System.out.println();
		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("2 X %d = %d\n", j, 2 * j);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
