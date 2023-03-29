package inherited;

import other.Person;

public class Ex07 {
	public static void main(String[] args) {
		// ※ 배열에는 참조 변수를 작성해도 되지만, 인스턴스를 바로 생서해도 된다~
		Person[] pers = new Person[] {
				new Student("홍길동", 15, 79),
				new Police("김진호", 27, "순경"),
				new Doctor("박찬호", 40, "외과")
			
		};
		
		
		// 업캐스팅된 하위 클래스가 원래 어떤 타입인지 판별할 수 있다
		// 이때, instanceof 라는 키워드를 사용한다
		
		System.out.println(pers[0] instanceof Student);
		// 해석 : pers[0]은 학생이 맞습니까? true
		
		System.out.println(pers[0] instanceof Police);
		// 해석 : pers[0]은 경찰이 맞습니까? false
		
		
		System.out.println(pers[1] instanceof Doctor);
		// 해석 : pers[1]은 의사가 맞습니까? false
		
		
	}
}
