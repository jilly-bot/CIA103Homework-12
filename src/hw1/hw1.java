package hw1;

public class Hw1 {

	public static void main(String[] args) {
		// • 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int num1 = 12;
		int num2 = 6;
		int 和 = num1 + num2;
		System.out.println("兩數的和是: " + 和);
		int 積 = num1 * num2;
		System.out.println("兩數的積是: " + 積);

		// • 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

		int 雞蛋 = 200;
		int 一打 = 12;
		int 打數 = 雞蛋 / 一打;
		int 餘數 = 雞蛋 % 一打;
		System.out.println("200顆蛋共是 " + 打數 + "打" + 餘數 + "顆蛋");

		// • 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int 總秒數 = 256559, 一天幾小時 = 24, 分鐘秒 = 60, 秒 = 60;
		int 一天幾秒 = 一天幾小時 * 分鐘秒 * 秒, 一天幾小時幾秒 = 分鐘秒 * 秒; // 一天幾秒鐘, 一小時幾秒鐘
		int 一天幾小時餘數 = 總秒數 % 一天幾秒, 分鐘餘數 = 一天幾小時餘數 % 一天幾小時幾秒, 幾秒餘數 = 分鐘餘數 % 秒;// 剩餘多少小時秒, 剩餘多少分鐘秒, 剩餘多少秒
		System.out
				.println("256559秒為" + (總秒數 / 一天幾秒) + "天" + (一天幾小時餘數 / 一天幾小時幾秒) + "小時" + (分鐘餘數 / 秒) + "分" + 幾秒餘數 + "秒");

		// • 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		// 圓面積=半徑x半徑x圓周率
		// 「直徑x 圓周率」=圓周長。
		final double 圓周率 = 3.1415;
		int 半徑 = 5;
		int 直徑 = 半徑 * 2;

		double 面積 = 半徑 * 半徑 * 圓周率;
		double 周長 = 直徑 * 圓周率;

		// 使用 String.format 來格式化輸出結果到小數點後第二位
		System.out.println("圓面積是 " + String.format("%.2f", 面積) + " 圓周長是 " + String.format("%.2f", 周長));

		//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
		//金加利息共有多少錢 (用複利計算,公式請自行google)
	
        double 初始本金 = 1500000.0;
        double 年利率  = 0.02;
        int 每年的利息計算次數 = 1;
        int 十年 = 10;
        double 複利計算公式 = 初始本金 * Math.pow((1 + 年利率 / 每年的利息計算次數), (每年的利息計算次數 * 十年));
        System.out.println(String.format("10年後本金加利息共有: %.2f 元", 複利計算公式));
      //• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
      //5 + 5
      //5 + ‘5’
      //5 + “5”
      //並請用註解各別說明答案的產生原因
        
        System.out.println(5 + 5); 
        // 結果為10，因是數學加法運算

        System.out.println(5 + '5'); 
        // 結果為62，因為'5'的ASCII值是53，加上5後得到58

        System.out.println(5 + "5"); 
        // 結果為"55"，有一方是字符串時+變字符串連接
        
	}
}


