package hw2;

public class Hw2_6 {

	public static void main(String[] args) {
		for (int i = 10; i >=1 ; i--) {  //i從10 開始，每次遞減1，直到i 小於等於1 為止。這表示我們從10 行開始列印，逐行減少。
			for (int j = 1; j <=i ; j++) {//j從1 開始，每次遞增1，直到j 小於等於i 為止。也就是說，每一行的數字個數與行數相同。
				System.out.print(j+" ");//列印當前的數字j，並在後面加一個空格。
			}
			if (i != 1) {//i 不等於1的話換行 最下面不會多一行
				System.out.println();//每完成一行數字的列印，就換行。
			}
			
		}

	
	
	}
	
	}
	






/*
請設計一隻Java程式,輸出結果為以下:
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */