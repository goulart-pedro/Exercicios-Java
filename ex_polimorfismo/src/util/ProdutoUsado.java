package util;

public class ProdutoUsado extends Produto {
    private String dataFabr;

    public ProdutoUsado(String nome, double preco, String dataFabr) {
        super(nome, preco);
        this.dataFabr = dataFabr;
    }

    @Override
    public String etiquetaPreco() {
        return String.format("nome:%s | data de fab.:%s | preço:%s", nome, this.dataFabr, preco);
    }

}
