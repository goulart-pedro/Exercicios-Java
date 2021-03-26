package util;

public class Conta {
    int conta;
    String titular;
    double saldo;

    public Conta() {
    }

    public Conta(int conta, String titular, double saldo) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double quantia) {
        saldo -= quantia + 5.0; // cobra 5.00 por saque.
    }

    public void deposito(double quantia) {
        saldo += quantia;
    }
}