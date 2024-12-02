package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Hw8_1 {
	public static void main(String[] args) {
        Collection<Object> collection = new ArrayList<>();

        collection.add(100);                // Integer
        collection.add(3.14);               // Double
        collection.add(21L);                // Long
        collection.add((short) 100);        // Short
        collection.add(5.1);                // Double
        collection.add("Kitty");            // String
        collection.add(100);                // Integer
        collection.add(new Object());       // Object
        collection.add("Snoopy");           // String
        collection.add(new BigInteger("1000")); // BigInteger

        System.out.println("Using Iterator:");
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing Traditional for loop:");
        List<Object> list = new ArrayList<>(collection); // 轉換為 List 來使用傳統 for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nUsing foreach loop:");
        for (Object item : collection) {
            System.out.println(item);
        }

        collection.removeIf(item -> !(item instanceof Number));

        System.out.println("\nAfter removing non-Number objects:");
        for (Object item : collection) {
            System.out.println(item);
        }
	}
}
