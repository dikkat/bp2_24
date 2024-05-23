package Lab9_section1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eislamoglu
 */
public class Soru3 {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            // ObjectOutputStream
            Personel per;
            in = new ObjectInputStream(new FileInputStream("Dosya.dat"));
            {
                while (true)
                    per=(Personel) in.readObject();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Soru3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Soru3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Soru3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(Soru3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }
    
}
