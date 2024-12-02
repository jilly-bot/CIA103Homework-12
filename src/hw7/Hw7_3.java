package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hw7_3 {
    public static void copyFile(String sourceFile, String destFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        try {
            fis = new FileInputStream(sourceFile);            
            fos = new FileOutputStream(destFile);
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            
            System.out.println("檔案已成功複製至 " + destFile);
        } catch (IOException e) {
            System.out.println("檔案複製時發生錯誤: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("關閉檔案流時發生錯誤: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        String sourceFile = "bin/hw7/Sample.txt";  // 來源檔案
        String destFile = "bin/hw7/Sample_dest.txt";      // 目標檔案
        
        copyFile(sourceFile, destFile);
    }
}