package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hw8_3 {
	public static void main(String[] args) {
		List<Train> trainList = new ArrayList<>();

		trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainList.add(new Train(118, "自強", "高雄", "台北", 500));
		trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(trainList);
		
        System.out.println("Using Iterator:");
        Iterator<Train> iterator = trainList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing Traditional for Loop:");
        Object[] trainArray = trainList.toArray();
        for (int i = 0; i < trainArray.length; i++) {
            System.out.println(trainArray[i]);
        }

        System.out.println("\nUsing foreach:");
        for (Train train : trainList) {
            System.out.println(train);
        }
	}
}
