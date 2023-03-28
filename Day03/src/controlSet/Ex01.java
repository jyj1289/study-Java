package controlSet;

import java.util.Scanner;

/*
 *  제어문 : 코드의 흐름을 제어하는 구문
 *  1. 조건문 : 참/거짓에 따라서 코드의 흐름을 분기
 *  2. 반복문 : 참/거짓에 따라서 코드를 루프
 *  3. 보조 제어문 : 위의 두 구문을 보조
 *  
 */
public class Ex01 {
	 public static void main(String[] args) {
		 // 조건문 if	: 조건식이 참이면 종속문장을 수행
		 // ※ 종속문장	: 특정 영역에 포함된 구문. {}로 묶여 있다
		 
		 // 조건문 else : 위의 조건이 거짓이면 수행
		 // - if의 보조 구문으로 단독으론 사용 불가능
		 // - 조건식을 가질 수 없다
		 
		 Scanner sc = new Scanner(System.in);
		 int age;
		 
		 System.out.print("나이 입력 : ");
		 age = sc.nextInt();
		 
		 if (age >= 20) {
			 System.out.print("성인 ");
		 }
		 else {
			 System.out.print("미성년자 ");
		 }
		 
		 System.out.println("입니다");
		 sc.close();
		
	}
}
