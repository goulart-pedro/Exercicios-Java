package app;

import java.util.Scanner;

import util.Mensagem;

/**
 * EnviaMensagem
 */
public class EnviaMensagem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String nomeSender = input.nextLine();
        // String txtmensagem = input.nextLine();
        Mensagem msg = new Mensagem();
        msg.setNomeSender("Bill Gates");
        msg.setTxtMensagem("Vou doar 50 milhoes de dolares!");
        input.close();
        System.out.println(msg.toString());
    }
}
