package util;

public class ContaPoupança extends Conta {
    private double taxaJuros;

    public ContaPoupança() {
        super();
    }

    public ContaPoupança(int conta, String titular, double saldo, double taxaJuros) {
        super(conta, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizaSaldo() {
        saldo = +saldo * taxaJuros;
    }

    @Override
    public void saque(double quantia) {
        saldo -= quantia;
    }
}
