package hw5;

//這題展示了可以透過兩種方式讓MyRectangle的使用者可以設定width和depth這兩個成員:
// 1. 透過setter方法，也就是void setWidth(double width)和void setDepth(double depth)
//    示範: MyRectangle myRec = new MyRectangle(); 
//         myRec.setWidth(10.0);
//         myRec.setDepth(20.0);
//         double area = myRec.getArea();
// 2. 透過建構子public MyRectangle(double width, double depth)
//    示範: MyRectangle myRec = new MyRectangle(10.0, 20.0);
//    double area = myRec.getArea();
public class MyRectangle {
	double width;
	double depth;
	public MyRectangle() {}
	public MyRectangle(double width, double depth) {
		this.width=width;
		this.depth=depth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	  MyRectangle myRec = new MyRectangle(); 
//      myRec.setWidth(10.0);
//      myRec.setDepth(20.0);
//      double area = myRec.getArea();
	}

	public void setWidth(double width) {
		this.width=width;//this.width = 10
	}

	public void setDepth(double depth) {
		this.depth=depth;
	}

	public double getArea() {
		
		return width*depth;
	}
}
//請設計一個類別MyRectangle:
//(1) 有兩個double型態的屬性為width, depth
//(2) 有三個方法:
//
//void setWidth(double width): 將收到的引數指定給width屬性(成員 要設在方法外面)
//void setDepth(double depth): 將收到的引數指定給depth屬性
//double getArea(): 能計算該長方形的面積
//
//(3) 有兩個建構子:
//
//public MyRectangle(): 不帶參數也無內容的建構子
//public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性