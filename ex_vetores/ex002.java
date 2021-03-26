package exercicioVetores;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int acumular = 0;
        int vetor[] = new int[4];
        for (int i : vetor) {
            vetor[i] = scan.nextInt();
            acumular = acumular + vetor[i];
        }
        scan.close();
        System.out.println("A média é:  " + (acumular / vetor.length));
    }

}
