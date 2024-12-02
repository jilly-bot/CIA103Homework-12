package hw7;

import java.io.*;

public class Hw7_5 {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\data\\Object.ser"))) {
        	final int count = 4;
        	for (int i = 0; i < count; i++) {
        		((Animal)(in.readObject())).speak();;
        	}            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}