package hw3;

import java.util.Scanner;
import java.util.Random;

public class Hw3_2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int randomNumber = random.nextInt(10);

		int inputNumber = -1; // 初始值設為 -1，以便進入迴圈
		System.out.println("猜個數字吧0~9");

		while (inputNumber != randomNumber) {
			System.out.println("請輸入數字:");
			inputNumber = scanner.nextInt();//注意不要少這一列
			if (inputNumber == randomNumber) {
				System.out.println("猜對了");
			} else {
				System.out.println("猜錯了，請輸入數字");
			}
		}
		scanner.close();// 關閉 Scanner 以釋放資源

	}
}

//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,
//猜錯會顯示錯誤訊息,猜對則顯示正確訊息