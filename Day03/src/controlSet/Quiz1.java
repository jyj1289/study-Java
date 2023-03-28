package controlSet;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;
		
		System.out.print("국 영 수 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		System.out.printf("국 %d, 영 %d, 수 %d\n", kor, eng, mat);
		System.out.printf("합계 : %d (= %.2f)\n", sum, avg);
	}
}
