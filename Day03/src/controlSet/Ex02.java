package controlSet;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// else if : 위의 조건이 거짓이면 조건을 검사
		// - if의 보조구문으로 단독으로 사용할 수 없다
		// - 조건식을 가지며, 참이면 수행한다
		// - 다중 조건 처리에 사용한다
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.print("성인 ");
		}
		else if (age >= 17) {
			System.out.print("고등학생 ");
		}
		else if (age >= 14) {
			System.out.print("중학생 ");
		}
		else {
			System.out.print("초등학생 이하 ");
		}
		System.out.println("입니다");
		sc.close();
	}
}
