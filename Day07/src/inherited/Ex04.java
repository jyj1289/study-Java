package inherited;

import other.Person;

// 클래스 간의 형변환
// - 클래스는 서로 상속 관계일때만 형변환이 가능하다

public class Ex04 {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", 27, 86);
		// 참조변수와 인스턴스의 타입이 일치 - 일반적인 사용 방식
		
		stu.showInfo();
		stu.study("수학");
		
		System.out.println();
		
		
		Person per = new Student("홍길동", 27, 86);
		// 참조 변수는 부모, 인스턴스는 자식
		// 자식을 부모로 형변환해서 참조. 이를 'up-casting)'라고 한다
		
		per.showInfo();
		// per.stduy("영어");
		// - 업캐스팅시, 자식의 멤버를 참조할 수 없게 된다
		
		// 업캐스팅을 하면 기능이 줄어드는데 왜 쓰는가?
		// - 업캐스팅은 상위 클래스로 하위 클래스를 묶어서 처리하기 위해서 존재
		// - ex) 학생, 경찰은 '사람'으로 묶어서 처리가 가능
		
		
		
		
		
	}
}
