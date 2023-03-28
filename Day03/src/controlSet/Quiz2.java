package controlSet;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int usb = 5000, count, total;
		
		System.out.print("USB 구매 개수? ");
		count = sc.nextInt();
		
		total = usb * count;
		
		if (count >= 100) {
			total *= 0.88;
		}
		else if (count >= 10) {
			total *= 0.9;		// total = (int)(total * 0.9);
		}
	}
}
