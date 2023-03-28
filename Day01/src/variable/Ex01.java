package variable;

// ctrl + space : eclipse의 자동완성

public class Ex01 {
	public static void main(String[] args) {
		// 자료형 : 코드에서 사용되는 데이터의 타입을 의미한다
		// 1. 문자열	: " "(쌍따옴표)로 묶인 데이터. 단어나 문장을 표현
		// 2. 문자	: ' '(홑따옴표)로 묶인 데이터. 글자 하나를 표현
		// 3. 정수	: 따옴표가 없는 숫자 데이터. 연산을 위한 타입
		// 4. 실수	: 숫자 중 소수점(.)이 있는 데이터. 연산을 위한 타입
		// 5. 논리	: 참/거짓을 판별하기 위한 데이터.
		
		
		System.out.println("10");
		System.out.println(10);
		System.out.println(10.0);
		System.out.println();
		
		
		System.out.println("10" + "20");	// 문자열의 + 연산은 이어붙이기
		System.out.println(10 + 20);		// 정수의 + 연산은 덧셈
		
		System.out.println("true");
		System.out.println(true);			// 논리 타입의 '참'에 해당
		System.out.println(false);			// '거짓'에 해당
		
	}
}
