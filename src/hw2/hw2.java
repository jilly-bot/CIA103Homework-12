package hw2;

public class hw2 {

	public static void main(String[] args) {
//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("1 到 1000 的偶數和是: " + sum);
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

		int 連乘積 = 1;
		for (int count = 1; count <= 10; count++)
			連乘積 *= count;
		System.out.println("1~10的連乘積是 " + 連乘積);
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		 
	
			 
			 
	}

}
