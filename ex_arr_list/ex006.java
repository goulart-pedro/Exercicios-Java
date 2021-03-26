
import java.util.ArrayList;

public class ex006 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Frankfurt");
        array.add("Berlin");
        array.add("Brandenburg");
        array.add("Pommerland");

        int index = 3; // indice do item a ser removido
        printArray(array);
        removerItem(array, index);
        printArray(array);
    }

    public static void printArray(ArrayList<String> array) {
        System.out.println("Itens atualmente no array\n" + array); // Printa o Array
    }

    public static void removerItem(ArrayList<String> array, int index) {
        array.remove(index); // Remove o item especificado no index

    }
}