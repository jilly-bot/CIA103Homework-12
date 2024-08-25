package hw2;

public class Hw2_5 {

	public static void main(String[] args) {
		// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		// 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		// 排除數字4：阿文不希望選擇的數字中出現數字4。/
		// 個位數和十位數：需考慮數字的個位數和十位數是否包含4。
		// 輸出結果：輸出阿文可以選擇的數字列表，以及總共的選擇數量。

		System.out.print("阿文可以選擇的樂透號碼：");
		int count = 0;
		for (int tensDigit = 0; tensDigit <= 4; tensDigit++) {
			for (int onesDigit = 0; onesDigit <= 9; onesDigit++) {
				int number = tensDigit * 10 + onesDigit;
				if (number >= 1 && number <= 49 && !String.valueOf(number).contains("4")) {
					System.out.print(number + " ");
					count++;

				}

			}
		}

		System.out.print("\n總共可以選擇" + count + "次");
	}

}
