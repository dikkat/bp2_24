package Lab5_section1;

import java.util.Locale;

public class Soru1 {
   
    public static void main(String[] args) {
        String word = "Computer Engineering";
        
        System.out.println("Uzunluk: " + word.length());
        System.out.println("Buyuk harf: " + word.toUpperCase(Locale.ENGLISH));
        System.out.println("Kucuk harf: " + word.toLowerCase());
        System.out.println("Bosluklari Sil: " + word.replace(" ", ""));
        System.out.println("'Department' Ekle: " + word.concat(" Department"));
        System.out.println("'e' Harflerini 'a' ile Degistir: " + word.replace('e', 'a').replace('E', 'A'));
        System.out.println("'n' Harfi Ilk Index: " + word.indexOf('n'));
        System.out.println("Ilk Karakter: " + word.charAt(0));
        System.out.println("Ilk 4 Karakter: " + word.substring(0, 4));
        
    }
   
}
