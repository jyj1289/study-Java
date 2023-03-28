package _static;


// static 멤버는 인스턴스가 공유하는 목적보다
// 사실, 인스턴스가 없어도 사용 가능하다는 특징을 더 자주 활용한다
// 대표적인 클래스로 Math라는 클래스가 있다

public class Ex03 {
	public static void main(String[] args) {
		// Math mat = new Math();
		// - Math 클래스는 모든 멤버가 static 멤버로 작성되어 있다
		// - 심지어, 인스턴스 생성도 불가능하게 막혀있다
		
		int n = Math.abs(-5);
		
		System.out.println("n = " + n);
		System.out.println("abs(5) = " + Math.abs(5) + "\n");
		
		double p = Math.pow(2,  10);
		
		System.out.println("p = " + p);
		System.out.println("2^5 = " + Math.pow(2, 5) + "\n");
		
		double r = Math.sqrt(4);
		
		System.out.println("루트 4 : " + r);
		System.out.println("루트 2 : " + Math.sqrt(2));
	}
}
