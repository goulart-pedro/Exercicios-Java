package exercicioVetores;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Questao01
 */

public class ex001 {

    public void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(Arrays.toString(vetor));
    }

}