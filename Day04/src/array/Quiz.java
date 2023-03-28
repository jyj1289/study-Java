package array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		int total = 0, max = 0, min = 99999;
		double avg;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i + 1 + "번째 : ");
			scores[i] = sc.nextInt();
			
			total += scores[i];
			
			if (max < scores[i]) { max = scores[i]; }
			if (min > scores[i]) { min = scores[i]; }
		}
		
		avg = (double)total / scores.length;
		
		System.out.println("\n점수 = " + Arrays.toString(scores));
		System.out.printf("합계 : %d (%.1f)\n", total, avg);
		System.out.printf("1등 : %d, 꼴등 : %d\n\n", max, min);
		
		// ※ 선택 정렬
		for (int i = 0; i < scores.length - 1; i++) {		// i : 0 ~ 마지막 전까지
			for (int j = i + 1; j < scores.length; j++) {	// j : i다음 ~ 마지막까지
				
				if (scores[i] > scores[j]) {	 			// 앞의 데이터가 크면
					int tmp = scores[i];					// 교체를 실시
					scores[i] = scores[j];	
					scores[j] = tmp;
				}
			}
		}
		
		System.out.println("점수 = " + Arrays.toString(scores));
		
		sc.close();
	}
}
