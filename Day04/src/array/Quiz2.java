package array;

public class Quiz2 {
	public static void main(String[] args) {
		int n = 8, count = 1;
		
		int[][] arr = new int[n][n];
		
		// 1번
		for (int i  = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = count++;
				
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 2번
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", arr[j][i]);
			}
			System.out.println();
		}
		System.out.println();
		
		// EX)
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					System.out.printf("%2d ", arr[i][j]);
				}
			}
			else {
				for (int j = n - 1; j >= 0; j--) {
					System.out.printf("%2d ", arr[i][j]);
				}
			}
			System.out.println();
		}
		
		System.out.println();
	}
}
