package hw2;

public class Hw2_3 {

	public static void main(String[] args) {
		//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
				int w_product = 1;
				int count = 1;
				while (count <= 10) {
					w_product *= count;
					count++;
				}
				System.out.println("1~10的連乘積是 " + w_product);

	}

}
