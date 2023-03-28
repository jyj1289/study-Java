package operatior;

public class Ex03 {
	public static void main(String[] args) {
		// 복합 대입 연산자 : 산술 + 대입
		
		int n = 10;
		
		n += 3;		// n = n + 3;
		System.out.println("n = " + n);		// 13
		
		n -= 5;
		System.out.println("n = " + n);		// 8
		
		n *= 2;
		System.out.println("n = " + n);		// 16
		
		n /= 3;
		System.out.println("n = " + n);		// 5
		
		n %= 4;
		System.out.println("n = " + n + "\n");	// 1
		
		int a = 5, b = 3, c = 1;
		
		a += b -= c *= 2;	
		
		System.out.println("a = " + a);		// 6
		System.out.println("b = " + b); 	// 1
		System.out.println("c = " + c);		// 2
	}
}
