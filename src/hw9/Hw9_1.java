package hw9;

import java.util.Random;

public class Hw9_1 {
	public static void main(String[] args) {
        Contestant c1 = new Contestant("饅頭人");
        Contestant c2 = new Contestant("詹姆士");

        // 創建兩個執行緒
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        
        System.out.println("-----大胃王快食比賽開始！-----");
        
        // 啟動執行緒
        t1.start();
        t2.start();

        try {
            // 等待兩個競賽者完成比賽
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("-----大胃王快食比賽結束！-----");
	}
}



class Contestant implements Runnable {
    private String name;

    public Contestant(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
 
            int sleepTime = rand.nextInt(2501) + 500;

            System.out.println(name + "吃第" + i + "碗飯");

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "吃完了！");
    }
}