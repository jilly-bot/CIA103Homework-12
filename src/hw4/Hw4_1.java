package hw4;

public class Hw4_1 {

	public static void main(String[] args) {
		int[] numbers = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
		}
		double avg=sum/numbers.length;
		System.out.println(avg);
		for (int i = 0; i < numbers.length; i++) {	//矩陣的位置
			if (numbers[i]>avg) {
				System.out.println(numbers[i]);
			}
		}
		
		
	}
}

//有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)