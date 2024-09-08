package hw3;

import java.util.Scanner;

public class Hw3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入第一個整數：");
		int a = scanner.nextInt();
		System.out.println("請輸入第二個整數：");
		int b = scanner.nextInt();
		System.out.println("請輸入第三個整數：");
		int c = scanner.nextInt();
		
		scanner.close();
		checkTriangle(a, b, c);
	}

	public static void checkTriangle(int a, int b, int c) {
		if (a + b > c && a + c > b && b + c > a) {
			// 可以形成三角形，進一步判斷類型
			if (a == b && b == c) {
				System.out.println("正三角形");
			} else if (a == b || b == c || a == c) {
				System.out.println("等腰三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
	}

}

//可以用排序 或return
//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、
//等腰三角形、其它三角形或不是三角形