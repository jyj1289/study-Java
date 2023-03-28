package controlSet;

public class Quiz {
	// 3과 5의 공배수의 총합을 나타내라
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				// 빈 구분 자체가 의미있다
			}
			else if (i % 3 == 0) {
				continue;
			}
			
			sum += i;
		}
		System.out.println("결과 : " + sum);
	}
}
