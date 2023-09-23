import java.lang.reflect.Array;
import java.util.*;

public class ColletionsTest {
    public static void main(String[] args) {
        HashSet<Integer> age = new HashSet<>();
        age.add(1);
        age.add(20);
        age.add(2);
        age.add(1);// tar ikke duplikater, ikke hensyn på rekkeføge,
    System.out.println(age);

        TreeSet<String> fruite = new TreeSet<>();
        fruite.add("Cherry");
        fruite.add("Banana");
        fruite.add("Apple");
        fruite.add("Apple");//Sorterer etter innsetting, tar ikke duplikater
        System.out.println(fruite);

        LinkedHashSet<String> navn = new LinkedHashSet<>();
        navn.add("Teo");
        navn.add("Sharmila");
        navn.add("Jibin");
        navn.add("Teo");
        navn.remove("Sharmila");
        System.out.println(navn);

        Map<Integer,String> info = new HashMap<>(); //Definer bare som Map på andre siden fordi kan senere endre implementasasjonen
        info.put(1,"Teo");
        info.put(3,"Sharmila");
        info.put(3,"Jibin");
        info.put(8,"Desi");
        info.remove(1);
        System.out.println(info);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("hei");
        strings.add("tester");
    }


}
