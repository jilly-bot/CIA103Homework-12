package hw5;
import java.util.Scanner;
public class Hw5_1 {

	public static void main(String[] args) {
		
		System.out.println("請輸入一個整數作為矩形的寬");
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		System.out.println("請輸入一個整數作為矩形的高");
		int height = scanner.nextInt();
		
		starSquare(width, height);
		
		scanner.close();
	}
	public static void starSquare(int width, int height ) 
	{
		for (int i = 0; i <height ; i++) {
			for (int j = 0; j <width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
	}

}
//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形: