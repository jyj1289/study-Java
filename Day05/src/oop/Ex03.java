package oop;

// class Person {
//		같은 패키지 내의 클래스는 서로 공유된다
// }
public class Ex03 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "홍길동";
		p2.name = "김진호";
		
		p1.run();		// this = p1;
		p2.run();		// this = p2;
						// - 즉, this는 인스턴스를 구분하기 위해서 존재
		p1.eat("짜장면");
		p2.eat("짬뽕");
	}
}
