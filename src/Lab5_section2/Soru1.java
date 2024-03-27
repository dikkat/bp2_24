package Lab5_section2;

import java.util.Locale;

/*
Uzunluk: 22
Büyük Harf:  COMPUTER ENGINEERING 
Küçük Harf:  computer engineering 
Boşlukları Sil: ComputerEngineering
‘Department’ Ekle: Computer Engineering Department
'e’ Harflerini 'a' ile Değiştir: Computar Enginaaring Dapartmant
'n' Harfi İlk İndex: 10
İkinci Karakter: C
İlk 5 Karakter: Comp
*/
public class Soru1 {
    public static void main(String[] args) {
        String word = " Computer Engineering ";
        System.out.println("Uzunluk: " + word.length());
        System.out.println("Buyuk Harf: " + word.toUpperCase(Locale.ENGLISH));
        System.out.println("Kucuk Harf: " + word.toLowerCase());
        System.out.println("Bosluklari Sil: " + word.replace(" ", ""));
        System.out.println("'Department' Ekle: " + word.concat(" Department"));
        System.out.println("'e' Harflerini 'a' ile Degistir: " + word.replace("e", "a").replace('E', 'A'));
        System.out.println("'n' Harfi Ilk Index: " + word.indexOf('n'));
        System.out.println("Ikinci Karakter: " + word.charAt(1));
        System.out.println("Ilk 5 Karakter: " + word.substring(0, 5));
    }
}
