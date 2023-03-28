package input;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 이름, 나이, 키, 성별을 입력할 변수를 선언
		String name;
		int age;
		double height;
		char gender;
		
		// 2. Scanner를 활용해서 1번의 변수에 입력 받는다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		System.out.print("신장 입력 : ");
		height = sc.nextFloat();
		
		System.out.print("성별 입력 : ");
		gender = sc.next().charAt(0);
		
		
		
		// 3. 결과는 아래와 같다
		// 이름 : 홍길동(31세, 여)
		// 신장 : 167.7cm
		String result = "\n이름 : %s (%d세, %c)\n";
		
		System.out.printf(result, name, age, gender);	// 너무 길면 변수에 지정해놓고 포맷팅해도 가능하다
		System.out.printf("신장 : %.1fcm\n", height);
		
		sc.close();
	}
}
