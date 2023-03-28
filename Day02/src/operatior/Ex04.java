package operatior;

public class Ex04 {
	public static void main(String[] args) {
		// 증감 연산자 : 피연산자를 1증가 혹은 1감소
		
		int n = 10;
		
		n++;		// 후치 : 연산자가 뒤에 붙은 경우
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n = " + n);
		
		++n;
		System.out.println("n = " + n);
		
		--n;
		System.out.println("n = " + n + "\n");
		
		// 기본적으로 전치, 후치는 차이가 없다
		// 단, 다른 연산과 혼합해서 사용시 차이가 발생
		
		int n1 = 10, n2, n3;
		
		n2 = ++n1;	// 전치 : 먼저 증감 후 다른 연산을 수행
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		
		n1 = 10;
		
		n3 = n1++;	// 후치 : 다른 연산 후 증감
		System.out.printf("n1 = %d, n3 = %d\n", n1, n3);
		
		int a = 7, b = 3, c = 6, d;
		
		d = ++a + b-- + c++;
	}
}
