package controlSet;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int station, total;
		
		System.out.print("정거장 수? ");
		station = sc.nextInt();
		
		// 1. 소요시간
		total = station * 2;
		
		if (station >= 10) {
			total = station * 4;
		}
		
		// 2. 시간 분할
		if (total >= 60) {
			int hour = total / 60;		// 64 / 60 = 1
			int minute = total % 60;		// 64 % 60 = 4
			
			System.out.printf("총 소요 시간 %d시간 %d분\n", hour, minute);
		}
		else {
			System.out.println("총 소요 시간 " + total + "분");
		}
		
		sc.close();
	}
}
