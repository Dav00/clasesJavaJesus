package oop.interfaces.Bancos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:\n " +
                "1) Cuenta Privada\n" +
                "2) Cuenta General"));
        switch (input){
            case 1: cuentaPrivada(); break;
            case 2: cuentaGeneral(); break;
            default: System.exit(1);
        }
    }

    private static BancaPrivada cuentaPrivada() {
        String numeroCuenta = "0001E";
        String nombreTitular = "";
        double saldo = 0;
        nombreTitular = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        saldo = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el saldo inicial que deseas ingresar?"));
        BancaPrivada bp1 = new BancaPrivada(saldo, numeroCuenta, nombreTitular);
        JOptionPane.showMessageDialog(null, bp1.toString());
        return bp1;
    }

    private static void cuentaGeneral() {
        String numeroCuenta = "";
        String nombreTitular = "";
        double saldo = 0;

    }
}
