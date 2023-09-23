import java.util.ArrayList;
import java.util.Arrays;

public class CommonNr {
    public static void main(String[] args) {

        //Finn felles tall i to arrays!
        int[] array1 = {1, 2, 4, 5, 6};
        int[] array2 = {2, 3, 6, 7, 10};
        ArrayList<Integer> commonNr = new ArrayList<>();

        for(int value : array1){
            for(int i = 0; i < array2.length; i++){
                if(value == array2[i]){
                    commonNr.add(value);
                    break;
                }
            }
        }
        System.out.println(commonNr);
    }
}
