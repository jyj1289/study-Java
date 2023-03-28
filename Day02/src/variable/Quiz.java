package variable;

public class Quiz {
	public static void main(String[] args) {
		// 1. 이름, 국 영 수 점수를 저장할 변수를 선언
		String name;
		int kor, eng, mat;
		
		// 2. 1번에서 선언한 변수에 값을 채운다
		name = "홍길동";
		kor = 70;
		eng = 80;
		mat = 98;
		
		// 3. 출력 결과는 아래와 같다
		// 이름 : 홍길동
		// 성적 : 국 70, 영 80, 수 98
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성적 : 국 %d, 영 %d, 수 %d", kor, eng, mat);
		
	}
}
