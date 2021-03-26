package exercicioVetores;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        /**
         * Recebe as as variáveis
         */
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scan.nextInt();
        }
        scan.close();
        /**
         * determina os anteriores e posteriores
         */
        for (int i = 1; i < vetor.length - 1; i++) {
            System.out.println("O número atual é:   " + vetor[i]);
            System.out.println("O número anterior é: " + vetor[i - 1]);
            System.out.println("O número posterior é:   " + vetor[i + 1]);
            System.out.println("A multiplicção vale:   " + vetor[i - 1] * vetor[i + 1]);
            System.out.println("========================");
        }

    }
}
