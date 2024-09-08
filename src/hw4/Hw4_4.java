package hw4;

public class Hw4_4 {

	public static void main(String[] args) {
		int[][] scores = { 
				        { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
			           	{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 60, 60, 75, 85, 89 },
				        { 98, 70, 89, 75, 90, 89, 90, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		//陣列這樣擺，適合:找出每次考試最高分的同學
		int[] maxScores = new int[scores[0].length];//maxScors存貼紙的地方假設每1考最高分同學獲得一張貼紙
		//宣告一個一維陣列用來儲存每位同學的最高分
		
//		int[][] scores = {{10,37,100,77,98,90},{35,75,70,95,70,80},
//				{40,77,79,70,89,100},{100,89,90,89,90,75},
//				{90,64,75,60,75,50},{85,75,70,75,90,20},
//				{75,70,79,85,89,99},{70,95,90,89,90,75}
//		};
//		//此i是索引index 這裡scores陣列長度是8格
		for (int i = 0; i < scores.length; i++) {
			int maxScore = 0;
			int maxStudent = 0;//放在內迴圈每次變數都會在內迴圈重新宣告值
			for(int j= 0; j < scores[i].length; j++) {
				if(scores[i][j] > maxScore) {//scores[i][j] 指的是第i考裡面的第j位同學的分數, maxScore是目前找到第j位同學之前的最高分數
					// 如果第j位同學的分數 > 目前找到第j位同學之前的最高分數
					maxScore = scores[i][j];//就把第j位同學的分數記錄到目前最高分數maxScore裡，以方便下一輪迴圈跟第j+1同學比大小
					maxStudent = j;//紀錄現在發現最高分的同學編號
				}
			}
			maxScores[maxStudent] = maxScores[maxStudent] + 1;//給該輪考試最高分同學一張貼紙   這裡會記住每個同學拿到幾張貼紙
		}
		                   //maxScores第11列(8位同學)每一位同學有幾張貼紙 例如[0,2,1,3,1,0,2,1]
		for (int i = 0; i < maxScores.length; i++) {
			System.out.println("第" + (i+1) + "位同學獲得最高分的次數為" + maxScores[i]);			
		}	

		
	}

}
//第1次(i==0)scores[i]是{10, 35, 40, 100, 90, 85, 75, 70}1考8位同學


//班上有8位同學,他們進行了6次考試結果如下:
//請算出每位同學考最高分的次數