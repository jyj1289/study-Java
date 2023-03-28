package controlSet;

public class Quiz2 {
	public static void main(String[] args) {
		
		int money = 1;
		int total = 0;
		
		for (int i = 1; i <= 30; i++) {
			total += money;
			
			money *= 2;
		}
		
		System.out.println("결과 : " + total);
	}
}
