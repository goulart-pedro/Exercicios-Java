package util;

public class ProdutoImportado extends Produto {

    public ProdutoImportado(String nome, double preco, double txAlfandega) {
        super(nome, preco);
        this.txAlfandega = txAlfandega;
    }

    private double txAlfandega;

    @Override
    public String etiquetaPreco() {
        return String.format("nome:%s | preço:%s + taxa:%s = %s", nome, preco, this.txAlfandega, this.precoTotal());
    }

    public double precoTotal() {
        return preco + this.txAlfandega;
    }

}
