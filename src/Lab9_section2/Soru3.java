package Lab9_section2;

import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eislamoglu
 */

class Personel implements Serializable {
    public String ad, soyad;
    public int maas;

    public Personel(String ad, String soyad, int maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }
}

public class Soru3 {
    public static void main(String[] args) throws IOException {
        Personel[] dizi = new Personel[]{
            new Personel("Mehmet", "Ak", 20000), 
            new Personel("Ahmet", "Kara", 21000),
            new Personel("Osman", "Beyaz", 22000)
        };
        
        File f = new File("C:\\Users\\eislamoglu\\Documents\\NetBeansProjects\\BP2\\files\\personel.dat");
        
        try {
            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(f, false));
            for (Personel p : dizi) {
                stream.writeObject(p);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Soru3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
