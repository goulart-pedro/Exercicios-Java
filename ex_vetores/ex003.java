package exercicioVetores;

import java.util.Arrays;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char vetor[] = new char[10];
        char vetorConsoantes[] = new char[vetor.length];
        int consoantes = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scan.next().charAt(0);
            String caractere = String.valueOf(vetor[i]);
            if (eVogal(caractere)) {
                consoantes++;
                vetorConsoantes[i] = vetor[i];
            }
        }
        scan.close();

        System.out.println("O número de consoantes é:   " + consoantes);
        System.out.println(Arrays.toString(vetorConsoantes));
    }

    public static boolean eVogal(String caractere) {
        return caractere.matches("(?i)[^aeiou]");
    }
}
