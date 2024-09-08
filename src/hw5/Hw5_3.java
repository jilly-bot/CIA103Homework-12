package hw5;

public class Hw5_3 {
	public static void main(String[] args) {
//		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
//		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
//		Hw5_3 fff = new Hw5_3();
//		System.out.println(fff.maxElement(intArray));
//		System.out.println(fff.maxElement(doubleArray));
		Hw5_3 w = new Hw5_3();
		//int three = 3;
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		//int[][] intArray2 = { { 1, 6, 3 }, { 9, 5, 10 } };
		//int ccc = fff.int134(three); // int ccc = 4;	
		//int ddd = fff.maxElement(intArray2);// int ccc = max
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}
	
//	public int int134(int x) {
//		return x + 1;
//}

	public int maxElement(int x[][]) {//x = intArray

		int max = x[0][0];//intAray[0][0]
		{
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++)
					if (x[i][j] > max) { //intArray[i][j] > max
						max = x[i][j];
					}
			}

			return max;
		}

	}

	public double maxElement(double x[][]) {
		
		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++)
				if (x[i][j] > max) {
					max = x[i][j];
				}

		}
		return max;
	}

}

//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳
//public static void main(String[] args) {
//Hw5_3 fff = new Hw5_3();
//fff.maxElement();
//int [][] aaa = null;
//double [][] bbb = null;
//System.out.println(fff.maxElement(aaa));
//System.out.println(fff.maxElement(bbb));
//}

//public int maxElement(int x[][]) {

//int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
//int max = intArray[0][0];
//{
//	for (int i = 0; i < intArray.length; i++) {
//		for (int j = 0; j < intArray[i].length; j++)
//			if (intArray[i][j] > max) {
//				max = intArray[i][j];
//			}
//	}
//
//	return max;
//}
//
//}
//
//public double maxElement(double x[][]) {
//double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
//double max = doubleArray[0][0];
//for (int i = 0; i < doubleArray.length; i++) {
//	for (int j = 0; j < doubleArray[i].length; j++)
//		if (doubleArray[i][j] > max) {
//			max = doubleArray[i][j];
//		}
//
//}
//return max;
//}