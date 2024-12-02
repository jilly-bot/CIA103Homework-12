package hw7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Hw7_2 {
    public static void main(String[] args) {

        String fileName = "bin/hw7/Data.txt";
        File file=new File(fileName);    
        if(!file.exists())    
        {    
            try {    
                file.createNewFile();    
            } catch (IOException e) {    
                // TODO Auto-generated catch block    
                e.printStackTrace();    
            }    
        }        

        Random rand = new Random();
        
        try (FileWriter writer = new FileWriter(file, true)) {
            for (int i = 0; i < 10; i++) {
                int randomNumber = rand.nextInt(1000) + 1;
                writer.write(randomNumber + "\n");
            }
            System.out.println("隨機數字已寫入 " + fileName);
        } catch (IOException e) {
            System.out.println("寫入文件時發生錯誤: " + e.getMessage());
        }
    }
}