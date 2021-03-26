package exercicioVetores;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        double vetorRaizes[] = new double[10];
        for (int i = 0; i < vetorRaizes.length; i++) {
            vetorRaizes[i] = Math.sqrt(scan.nextInt());
            soma = soma + Math.sqrt(vetorRaizes[i]);
        }
        scan.close();
        System.out.println(soma);
    }
}