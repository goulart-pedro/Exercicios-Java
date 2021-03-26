package app;

import java.util.Scanner;
import util.Produto;
import util.ProdutoImportado;
import util.ProdutoUsado;

public class RegistrarProdutos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("quantos produtos?");
        int numProdutosParaArmazenar = input.nextInt();
        Produto[] arrayDeProdutos = new Produto[numProdutosParaArmazenar];

        for (int i = 0; i < numProdutosParaArmazenar; i++) {
            System.out.println("1 -  usado, 2 - novo, 3 - importado?");
            int option = input.nextInt();
            if (option == 1) {
                arrayDeProdutos[i] = registrarProdutoUsado();
            }
            if (option == 2) {
                arrayDeProdutos[i] = registrarProdutoNovo();
            }
            if (option == 3) {
                arrayDeProdutos[i] = registrarProdutoImportado();
            }

            System.out.println("registrado!");

        }

        for (int i = 0; i < numProdutosParaArmazenar; i++) {
            System.out.println(arrayDeProdutos[i].etiquetaPreco());
        }
        input.close();
    }

    public static Produto registrarProdutoNovo() {

        System.out.println("Informe o nome e o preço do produto");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        double preco = input.nextDouble();
        input.close();
        return new Produto(nome, preco);

    }

    public static Produto registrarProdutoUsado() {

        System.out.println("Informe o nome, preço e data de fabr. do produto");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        double preco = input.nextDouble();
        String dataFabr = input.nextLine();
        input.close();
        return new ProdutoUsado(nome, preco, dataFabr);

    }

    public static Produto registrarProdutoImportado() {

        System.out.println("Informe o nome, preço e a taxa do produto");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        double preco = input.nextDouble();
        double txAlfandegaria = input.nextDouble();
        input.close();
        return new ProdutoImportado(nome, preco, txAlfandegaria);

    }
}
