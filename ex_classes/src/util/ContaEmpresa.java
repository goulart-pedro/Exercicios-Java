package util;

public class ContaEmpresa extends Conta {
    double limitEmp;

    public ContaEmpresa() {
        super();
    }

    public ContaEmpresa(int conta, String titular, double saldo, double limitEmp) {
        super(conta, titular, saldo);
        this.limitEmp = limitEmp;
    }

    public void empresta(double quantia) {
        if (quantia <= limitEmp)
            saldo += quantia;
    }

    @Override
    public void saque(double quantia) {
        super.saque(quantia);
        saldo -= 2.0;
    }

    public double getLimitEmp() {
        return limitEmp;
    }

    public void setLimitEmp(double limitEmp) {
        this.limitEmp = limitEmp;
    }
}
