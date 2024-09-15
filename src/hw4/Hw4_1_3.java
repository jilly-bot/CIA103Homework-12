package hw4;

public class Hw4_1_3 {

	public static void main(String[] args) {
		// 定義八大行星的字串陣列
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		// 呼叫函式來計算母音的總數
		int vowelCount = countVowels(planets);
		//               ^^^^^^^^^^^^^^^^^^^^^ 呼叫int countVowels(String[] words)

		// 輸出母音的數量
		System.out.println("Total number of vowels: " + vowelCount);
	}

	// 函式來計算母音的數量
	public static int countVowels(String[] words) {
		int count = 0;
		// 定義母音字符
		String vowels = "aeiou";

		// 遍歷每個字串
		//增強型 for 迴圈：for (type element : collection)collection：一個可以迭代的資料結構
		for (String word : words) {
		//for (int i = 0; i < words.length; i++) {
		//	String word = words[i];
		//}
		
			// 遍歷字串中的每個字元
			for (char c : word.toCharArray()) {
		  //for (char c : char[]) {
				// 檢查字元是否為母音
				//word.toCharArray() 方法會將字串 word 轉換成一個字符陣列（char[]）
				if (vowels.indexOf(c) != -1) {
					count++;
				}
			}
		}
		return count;
	}
}

//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)