
import java.util.ArrayList;

public class ex002 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        for (Integer item : arr) {
            System.out.printf("O item atual é %d\n", item);
        }
    }
}