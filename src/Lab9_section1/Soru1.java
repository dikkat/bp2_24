package Lab9_section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author eislamoglu
 */
public class Soru1 {
    public static void main(String[] args) {
        File f = new File("C:/Users/eislamoglu/Documents/NetBeansProjects/BP2/files/test.txt"); // classpath
        try {
            Scanner scanner = new Scanner(f);
            
            int[] dizi = new int[15];
            int i = 0;
            int sayac = 0;
            while (scanner.hasNextInt()) {
                dizi[i] = scanner.nextInt();
                i++;
                sayac++;
            }
            
            int toplam = 0;
            for (i = 0; i < sayac; i++) {
                toplam += dizi[i];
            }
            
            System.out.println(toplam);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        }
        
    }
}
