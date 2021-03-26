
import java.util.ArrayList;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
        ArrayList<String> coluna1 = new ArrayList<String>();
        ArrayList<String> coluna2 = new ArrayList<String>();
        ArrayList<String> coluna3 = new ArrayList<String>();

        coluna1.add("item0");
        coluna1.add("item1");
        coluna1.add("item2");

        coluna2.add("item3");
        coluna2.add("item4");
        coluna2.add("item5");

        coluna3.add("item6");
        coluna3.add("item7");
        coluna3.add("item8");

        matriz.add(coluna1);
        matriz.add(coluna2);
        matriz.add(coluna3);

        String item = getItem(matriz);
        printItem(item);

    }

    public static String getItem(ArrayList<ArrayList<String>> array) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Selecione uma coluna em %d\s", array.size());
        int coluna = input.nextInt();
        System.out.printf("Seleciona uma linha em %d\s", array.get(coluna).size());
        int linha = input.nextInt();
        input.close();
        return array.get(coluna).get(linha); // Retorna o item dentro do array informado

    }

    public static void printItem(String item) {
        System.out.printf("Tu selecionastes \"%s\"\n", item); // Printa o item
    }

}