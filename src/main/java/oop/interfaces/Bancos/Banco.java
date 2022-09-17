package oop.interfaces.Bancos;

public class Banco {
    double saldo;
    String numeroCuenta;
    String nombreTitular;

    @Override
    public String toString() {
        return "Banco{" +
                "saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", nombreTitular='" + nombreTitular + '\'' +
                '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public Banco(double saldo, String numeroCuenta, String nombreTitular) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
    }
}
