package oop;

class Student{
	String name;
	int kor, eng, mat;
	
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	Student(String name){
		this.name = name;
	}
	
	void showInfo() {
		String result = "%s (국 %d, 영 %d, 수 %d)\n";
		
		System.out.printf(result, name, kor, eng, mat);
	}
	
	int total() {
		return kor + eng + mat;
	}
}

public class Quiz {
	public static void main(String[] args) {
		// 아래 코드가 실행되게 클래스를 작성한다
		// ※ 필드는 이름, 국 영 수를 가진다
		Student stu1 = new Student("홍길동", 70, 80, 98);
		Student stu2 = new Student("김진호");
		
		stu1.showInfo();		// 홍길동 (국 70, 영 80, 수 98)
		stu2.showInfo();		// 김진호 (국 0, 영 0, 수 0)
		
		System.out.println("stu1의 합계 : " + stu1.total()); // 248
		System.out.println("stu2의 합계 : " + stu2.total()); // 0
	}
}
