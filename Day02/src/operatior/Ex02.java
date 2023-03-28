package operatior;

public class Ex02 {
	public static void main(String[] args) {
		// 대입 연산자 : 공간에 값을 할당하는 연산자
		// 1. 대입 연산의 좌변은 '공간', 우변은 '결과값'
		// 2. 대입 연산은 항상 우변부터 수행한다
		// 3. 대입 연산의 양변의 자료형은 항상 일치시킨다
		
		int n = 10 + 3;
		// int n = 13;
		
		System.out.println("n = " + n + "\n");
		
		
		int a, b, c;
		
		a = b = c = 30;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
