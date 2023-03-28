package output;

public class Ex03 {
	public static void main(String[] args) {
		// escape sequence : 문자열 내에서 특수한 형태로 사용되는 문자들
		// - \ (백슬래시)와 결합되어 사용된다
		// ※ 문자열 	: " "(쌍따옴표)로 묶인 데이터. 단어나 문장을 표현하는 데이터 타입이다
		// ※ 문자		: ' '(홑따옴표)로 묶인 데이터. 글자 하나를 표현하는 데이터 타입 
		
		System.out.println("Hello\nWorld!!!");		// \n : new line, 줄바꿈
		System.out.println("Hello \t\t World!!!");	// \t : tab, 들여쓰기
		
		System.out.println("저희 자바 버전은 '1.8'입니다");
		System.out.println("저희 자바 버전은 \"1.8\"입니다");			// \" : 문자열 묶는 기능을 제거
		
		System.out.println("공유 폴더는 \\\\192.168.111.39 입니다");	// \\ : 이스케이프 기능을 제거
	}
}
