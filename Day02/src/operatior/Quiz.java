package operatior;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("1. 3의 배수 판별 : ");
		n = sc.nextInt();
		
		String result = (n % 3 == 0) ? "3의 배수" : "3의 배수 아님";
		
		System.out.printf("%d(은)는 %s\n", n, result);
		
		// 3과 5의 공배수를 판별
		result = (n % 3 == 0 && n % 5 == 0) ? "공배수" : "공배수 아님";
		
		System.out.printf("%d(은)는 %s\n", n, result);
		
		sc.close();
		
	}
}
