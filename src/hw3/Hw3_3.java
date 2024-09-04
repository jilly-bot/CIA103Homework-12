package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("阿文...請輸入你討厭哪個數字？");
        int dislikeDigit = scanner.nextInt();

       
        List<Integer> allNumbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            allNumbers.add(i);
        }

        // 過濾掉包含阿文不喜歡的數字的號碼
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int number : allNumbers) {
            if (!String.valueOf(number).contains(String.valueOf(dislikeDigit))) {
                filteredNumbers.add(number);
            }
        }

        // 顯示可以選擇的號碼
        System.out.println("可以選擇的號碼：");
        for (int i = 0; i < filteredNumbers.size(); i++) {
            System.out.printf("%2d  ", filteredNumbers.get(i));
            if ((i + 1) % 7 == 0) {
                System.out.println();
            }
        }

        // 顯示剩餘號碼的總數
        System.out.println("\n總共有" + filteredNumbers.size() + "數字可選");

        scanner.close();
    }
}



//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數