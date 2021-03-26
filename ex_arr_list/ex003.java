
import java.util.ArrayList;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Vermelho");
        arr.add("Azul");
        arr.add("Bege");
        arr.add("Verde");
        arr.add("Cinza");

        printArray(arr);
        adicionarItem(arr, input);
        input.close();
        printArray(arr);
    }

    public static void printArray(ArrayList<String> array) {
        System.out.println("Itens atuais no array\n" + array); // Printa o Array
    }

    public static void adicionarItem(ArrayList<String> array, Scanner input) {
        System.out.printf("Digite o novo item a ser inserido na posição 1 \n");
        array.add(0, input.nextLine());

    }

}