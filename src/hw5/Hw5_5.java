package hw5;
import java.security.SecureRandom;//SecureRandom會是較安全的產生亂數類別
public class Hw5_5 {
	private static final String CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static int AUTH_CODE_LENGTH = 8;
	private static  SecureRandom RANDOM = new SecureRandom();
	
	public static void main(String[] args) {
		
		System.out.println(genAuthCode());
		
	}

	
	public static String genAuthCode() {
		//下面不用String captcha = new String 是因為String裡的內容不能被更改，String[]的意思是一個放了"字串"的陣列不是"字元"
		char[] captcha = new char[AUTH_CODE_LENGTH];//private static int AUTH_CODE_LENGTH = 8
		// 填字符池中的隨機字符到 captcha 陣列
        for (int i = 0; i < AUTH_CODE_LENGTH; i++) {
            int randomIndex = RANDOM.nextInt(CHAR_POOL.length());
            captcha[i] = CHAR_POOL.charAt(randomIndex);//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#charAt(int)
        }

        // 將 char 陣列轉換為 String 並返回
        return new String(captcha);
    }

		
		
		
	}

//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合