package app;

import util.Conta;

public class Banco {
    public static void main(String[] args) {
        Conta acc = new Conta(1001, "Alex", 0.0);
        acc.deposito(1000.00);
        acc.saque(300.00);
        System.out.print(
                "Nº da conta: " + acc.getConta() + " \nTitular: " + acc.getTitular() + " \nSaldo: " + acc.getSaldo());
    }
}

