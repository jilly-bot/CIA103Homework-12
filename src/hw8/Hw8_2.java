package hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hw8_2 {
	public static void main(String[] args) {
		Set<Train> trainSet = new HashSet<>();

		trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
		trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));

        System.out.println("Using Iterator:");
        Iterator<Train> iterator = trainSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing Traditional for Loop:");
        Object[] trainArray = trainSet.toArray();
        for (int i = 0; i < trainArray.length; i++) {
            System.out.println(trainArray[i]);
        }

        System.out.println("\nUsing foreach:");
        for (Train train : trainSet) {
            System.out.println(train);
        }
	}
}
