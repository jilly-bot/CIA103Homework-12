package hw2;

public class Hw2_2 {

	public static void main(String[] args) {
		//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

				int product = 1;
				for (int count = 1; count <= 10; count++)// count計數
					product *= count;
				System.out.println("1~10的連乘積是 " + product);

	}

}
