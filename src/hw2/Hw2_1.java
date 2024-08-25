package hw2;

public class Hw2_1 {

	public static void main(String[] args) {
//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("1 到 1000 的偶數和是: " + sum);


	}

}

