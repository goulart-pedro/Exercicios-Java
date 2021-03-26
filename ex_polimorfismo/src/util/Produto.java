package util;

public class Produto {
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    protected String nome;
    protected double preco;

    public String etiquetaPreco() {
        return String.format("nome:%s | preço:%s", this.nome, this.preco);
    }

    public String getNome() {
        return nome;
    }

}
