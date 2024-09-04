package hw4;

import java.util.Scanner;

public class Hw4_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入年份(yyyy): ");
		int year = scanner.nextInt();

		System.out.print("請輸入月份(mm): ");
		int month = scanner.nextInt();

		System.out.print("請輸入日期(dd): ");
		int day = scanner.nextInt();
//定義每月天數的陣列
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

// 檢查是否為閏年，若是則將二月天數設為29
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			daysInMonth[1] = 29;
		}
		if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
// 陣列的索引是從0開始的，因此1月對應的是索引0，使用者輸入的月份通常是從1到12。因此，在陣列中取值時需要減去1
			
			System.out.println("輸入的日期無效，請檢查月份和日期的範圍。");
			return;// 這裡的 return; 主要作用是當偵測到輸入的日期無效時，提早結束 main 方法的執行，不再繼續執行後續的程式碼。
		}
		int dayOfYear = 0;
// 計算當年第幾天
        for (int i = 0; i < month - 1; i++) {
//累加從1月到（輸入的月份 - 1）這些月份的總天數。
        	dayOfYear += daysInMonth[i];
            
        }
        System.out.println("輸入的日期為該年第" + dayOfYear + "天");
	}


}

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

//閏年條件
//能被4整除且不能被100整除的年份一定是閏年。例如：1992年、2004年。
//能被400整除的年份也一定是閏年。例如：1600年、2000年。
//其他年份都是平年。例如：1900年、2100年。