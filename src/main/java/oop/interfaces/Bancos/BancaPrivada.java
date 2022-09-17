package oop.interfaces.Bancos;

public class BancaPrivada extends Banco implements IBanco {
    public BancaPrivada(double saldo, String numeroCuenta, String nombreTitular) {
        super(saldo, numeroCuenta, nombreTitular);
    }

    @Override
    public void retirarDinero(double dinero) {
        if(dinero > this.saldo){
            System.out.println("Me parece bien, te lo pongo a credito cuidadito 😒");
        }
        System.out.println("He retirado "+dinero + "€" + "💸💸💸");
        this.saldo = saldo - dinero; //this.saldo -= dinero;
    }

    @Override
    public void ingresarDinero(double dinero) {
        System.out.println("Se ha ingresado correctamente " + dinero + "€");
        this.saldo += dinero;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Usted tiene " + this.saldo + " €.");
    }
}
