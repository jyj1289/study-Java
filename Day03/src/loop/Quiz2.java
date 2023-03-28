package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 4번)
		Scanner sc = new Scanner(System.in);
		int n, count = 0;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("(" + count + "개)");
		
		// 5번)
		if (count == 2) {
			System.out.println("소수");
		}
		else {
			System.out.println("소수 아님");
		}
		
		sc.close();
	}
}
