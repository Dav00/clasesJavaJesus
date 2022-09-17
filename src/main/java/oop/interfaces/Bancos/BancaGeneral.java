package oop.interfaces.Bancos;

public class BancaGeneral extends Banco implements IBanco{
    public BancaGeneral(double saldo, String numeroCuenta, String nombreTitular) {
        super(saldo, numeroCuenta, nombreTitular);
    }

    @Override
    public void retirarDinero(double dinero) {
        if(dinero > this.saldo){
            System.out.println("No tienes dinero señor.");
        }
        else{
            System.out.println("Has retirado correctamente " + dinero + " €.");
            this.saldo -= dinero;
        }
    }

    @Override
    public void ingresarDinero(double dinero) {
        if(dinero >= 6000){
            System.out.println("No puedes ingresar tanto señooooooor.");
        }
        else{
            this.saldo += dinero;
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Usted tiene " + this.saldo + " €.");
    }
}
