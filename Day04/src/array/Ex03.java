package array;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// 여러 타입의 배열을 작성
		// ※ 배열은 빈 공간을 생성하면, 자동으로 해당 타입의 기본값으로 초기화 한다
		boolean[] bos = new boolean[2];
		char[] chs = new char[3];
		int[] its = new int[5];
		double[] dbs = new double[3];
		
		String[] sts = new String[3];	// 클래스 타입은 '참조 타입'이다
										// 참조 타입 기본값은 null
		
		System.out.println("bos = " + Arrays.toString(bos));
		System.out.println("chs = " + Arrays.toString(chs));
		System.out.println("its = " + Arrays.toString(its));
		System.out.println("dbs = " + Arrays.toString(dbs));
		System.out.println("sts = " + Arrays.toString(sts));
	}
}
