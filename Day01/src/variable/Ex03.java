package variable;

// 변수 : 데이터를 저장하는 공간. 변하는 수
// - 저장을 통해서 중복되는 연산을 줄일수 있다

public class Ex03 {
	public static void main(String[] args) {
		// 변수의 선언 : 변수를 생성하는 것
		
		int num = 10;	// 자료형 변수명 = 값;
		
		System.out.println("num");
		System.out.println(num);	// 변수의 호출 : 앞서 선언된 변수를 사용하는 것 (= 참조)
		
		System.out.println("num = " + num + "\n");
		
		
		num = 20;
		
		System.out.println("num = " + num + "\n");
	}
}
