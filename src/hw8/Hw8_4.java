package hw8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hw8_4 {
	public static void main(String[] args) {
		Comparator<Train> byNumberDesc = (train1, train2) -> Integer.compare(train2.getNumber(), train1.getNumber());

		Set<Train> trainSet = new TreeSet<>(byNumberDesc);

		trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
		trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));

		System.out.println("Train objects sorted by number (descending):");

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
