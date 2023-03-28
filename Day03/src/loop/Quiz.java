package loop;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 1번)
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i * n + " ");
		}
		System.out.println("\n");
		
		// 2번)
		for (int i = n; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// 3번)
		int rev = 0;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		
		System.out.println("rev = " + rev);
		sc.close();
	}
}
