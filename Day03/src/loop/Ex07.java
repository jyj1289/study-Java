package loop;

public class Ex07 {
	public static void main(String[] args) {
		// 보조 제어문
		
		// 1. break : 제어문을 '즉시' 종료
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i + " ");
		}
		System.out.println();
		
		// 2. continue : 제어문 '즉시' 처음으로
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i + " ");
		}
		System.out.println();
	}
}
