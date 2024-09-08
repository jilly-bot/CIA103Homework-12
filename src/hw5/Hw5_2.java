package hw5;


import java.util.Random;

public class Hw5_2 {

	public static void main(String[] args) {
		randAvg();

	}

	public static void randAvg() {
		// 創建一個長度為 10 的整數陣列來存放亂數
		int[] numbers = new int[10];
		double sum = 0;
		// 隨機產生1~100間的數字存入數字陣列中
		for (int i = 0; i < numbers.length; i++) {
			Random ran = new Random();
			numbers[i] = ran.nextInt(100) + 1;
			sum += numbers[i];
			System.out.println(numbers[i]);
		}

		double avg = 0;
		avg = sum / numbers.length;
		System.out.println("平均是"+avg);
	}

}

//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值