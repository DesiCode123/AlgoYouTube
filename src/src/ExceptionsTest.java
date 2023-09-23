import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsTest {
    public static void main(String[] args) {
        testExeption();
    }

    public static void testExeption() {
        System.out.println();
        try {
            String s = "33d";
            Integer tst = Integer.parseInt(s);

            System.out.println();
        } catch (NumberFormatException nfe) {
            System.out.println("hei du prøver å sende tall til string");
        }
    }
}