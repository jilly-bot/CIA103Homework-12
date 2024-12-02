package hw7;

import java.io.*;

public class Hw7_4 {
    public static void main(String[] args) {
        File directory = new File("C:\\data");
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Folder C:\\data was created");
        }

        Dog dog1 = new Dog("Jimmy");
        Dog dog2 = new Dog("Chang");
        Cat cat1 = new Cat("Amber");
        Cat cat2 = new Cat("Jilly");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\data\\Object.ser"))) {
            out.writeObject(dog1);
            out.writeObject(dog2);
            out.writeObject(cat1);
            out.writeObject(cat2);
            System.out.println("Wrote to C:\\data\\Object.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}