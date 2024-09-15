package hw4;

public class Hw4_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 String s = "Hello World";

	        // 使用 StringBuilder 來反轉字串
	        StringBuilder sb = new StringBuilder(s);
	        String reversed = sb.reverse().toString();
	        
//	        建立一個 StringBuilder 物件，並初始化為原始字串 s。
//	        調用 reverse() 方法來反轉 StringBuilder 內部的字串。
//	        使用 toString() 方法將反轉後的 StringBuilder 物件轉換回字串。

	        // 輸出反轉後的字串
	        System.out.println(reversed);
		
	}

}
//請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH