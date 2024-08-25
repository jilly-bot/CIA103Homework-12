package hw2;

public class Hw2_7 {
	public static void main(String[] args) {
		{
			char a = 'A';
			int difference = 'F' - 'A';
			for (int i = 0; i <=difference; i++) {//控制字元是哪個
				for (int j = 0; j <= i; j++) {//控制字元要重複印幾次
					System.out.print((char)((int)a+i));//印出字元 (轉成char(char A)轉成int 65 + int i)
				}System.out.println();
			}
			
			
		}
	}
}

/*
請設計一隻Java程式,輸出結果為以下:
A
BB
CCC
DDDD
EEEEE
FFFFFF
A+1=B
A+2=C

for (int i = 10; i >=1 ; i--) {  //i從10 開始，每次遞減1，直到i 小於等於1 為止。這表示我們從10 行開始列印，逐行減少。
			for (int j = 1; j <=i ; j++) {//j從1 開始，每次遞增1，直到j 小於等於i 為止。也就是說，每一行的數字個數與行數相同。
				System.out.print(j+" ");//列印當前的數字j，並在後面加一個空格。
			}
			if (i != 1) {//i 不等於1的話換行 最下面不會多一行
				System.out.println();//每完成一行數字的列印，就換行。


*/
