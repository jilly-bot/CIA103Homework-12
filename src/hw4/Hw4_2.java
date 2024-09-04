package hw4;

import java.util.Scanner;

public class Hw4_2 {

	public static void main(String[] args) {

		System.out.println("你要借多少?");
		int[][] intArray = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();

		for (int j = 0; j < intArray[1].length; j++) {
			if (inputNumber < intArray[1][j]) {
				System.out.println(intArray[0][j]);

			}
		}

//System.out.println(intArray[1][j]);
//System.out.println(intArray[0][j]);
		// 把金額的那個陣列全部讀出來

		// 讀出來後和小華要借的金額比大小

		// 找到比要借的金額大的同事是誰，把員工編號列出來
	}

}

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下:
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」