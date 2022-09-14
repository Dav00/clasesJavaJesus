package oop;

import utils.RandomUtils;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        System.out.println(p1.getAltura());
        System.out.println(p1.getNombre());
        p1.setAltura(2);
        System.out.println(p1.getAltura());
        p1.saludar();
        System.out.println(RandomUtils.numeroAleatorioMax100());
    }
}
