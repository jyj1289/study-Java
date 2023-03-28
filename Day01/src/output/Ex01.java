package output;			// 현재 클래스가 속한 패키지명

public class Ex01 {		// 현재 클래스명
	
	public static void main(String[] args) {	// main 함수 : 코드는 항상 여기서 부터 수행된다
		
		System.out.println("Hello Java~");		// System : 표준 입출력을 관리하는 클래스
												// out : 출력을 지원하는 객체(= 대상)
												// println() : 출력 함수(= 기능)
		System.out.println("안녕 자바~"); 
		
		System.out.println("코드는 main에서 부터 위에서 아래로 순차적으로 수행");
		
		System.out.println("빈 줄은 실행하는 줄이 아니다. 엔터가 아님을 명심");
		
	}
}
