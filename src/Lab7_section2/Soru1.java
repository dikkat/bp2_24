package Lab7_section2;

/**
 *
 * @author eislamoglu
 */
public class Soru1 {
    public static void main(String[] args) {
        String s[]={"1" , "6" , "1g", "10", "d"};
        for (String ss: s) {
            try {
                Integer.parseInt(ss); 
            } catch (NumberFormatException e) {
                System.out.println(ss);
            }
        }
    }

}
