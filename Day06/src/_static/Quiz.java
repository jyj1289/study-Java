package _static;

import other.Func;

public class Quiz {
	public static void main(String[] args) {
		// Math처럼 static 메서드를 제공하는 클래스를 작성
		// other 패키지에 클래스를 작성한다4
		
		// 1. 절대값을 반환
		int n = Func.absolute(-5);
		
		System.out.println("n = " + n);
		
		// 2. 원넓이 반환. 원주율은 3.14로 계산
		double w = Func.circle(3.87);
		
		System.out.println("\nw = " + w);
		
		// 3. 1 ~ n까지의 합계를 반환
		int sum = Func.total(5);
		
		System.out.println("\nsum = " + sum);
		
		// 4. 수를 거꾸로 뒤집어서 반환
		int rev = Func.reverse(123);
		
		System.out.println("\nrev = " + rev);
		
		// 5. 소수를 판별하는 메서드
		// 소수면 true, 아니면 false를 리턴
		boolean prime = Func.isPrime(7);
		
		System.out.println("\nprime = " + prime);
		
		// Func는 인스턴스 생성이 불가능하다
		// Func f = new Func();
	}
}
