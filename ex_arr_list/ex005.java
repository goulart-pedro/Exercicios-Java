
import java.util.ArrayList;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Frankfurt");
        array.add("Berlin");
        array.add("Brandenburg");
        array.add("Pommerland");
        printArray(array);
        adicionarItem(array);
        printArray(array);
    }

    public static void printArray(ArrayList<String> array) {
        System.out.println("Itens atualmente no array\n" + array); // Printa o Array
    }

    public static void adicionarItem(ArrayList<String> array) {
        Scanner input = new Scanner(System.in);
        int index; // Recebe o indice do item
        String item; // Recebe o novo item

        System.out.printf("Digite qual a posição do item a ser atualizado");
        index = input.nextInt();

        System.out.printf("Digite o novo item a ser inserido\n");
        item = input.next();

        array.set(index, item); // adiciona ao array um item na posição especificada
        input.close();

    }
}