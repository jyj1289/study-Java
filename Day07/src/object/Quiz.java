package object;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 로그인 프로세스 구현
		// - 아래 한 계정의 정보가 있다
		// - 사용자에게 ID/PW를 입력 받아서 
		//   아래 정보와 일치하면 로그인 성공을 출력
		//   ID나 PW가 다르면 로그인 실패를 출력한다
		String storeId = "itbank";
		String storePw = "it";
		
		Scanner sc = new Scanner(System.in);
		String userId, userPw;
		
		System.out.print("ID 입력 : ");
		userId = sc.next();
		
		System.out.print("PW 입력 : ");
		userPw = sc.next();
		
		
		boolean sameId = storeId.equals(userId);
		boolean samePw = storePw.equals(userPw);
		
		if (sameId && samePw) {
			System.out.println(storeId + "님 로그인");
		}
		else {
			System.out.println("로그인 실패");
		}
		
		sc.close();
		
	}
}
