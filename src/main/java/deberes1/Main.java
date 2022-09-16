package deberes1;

public class Main {
    public static void main(String[] args) {
        //Creo objetos
        Animal animal1 = new Animal("Gato", "mamifero", 4);
        Animal animal2 = new Animal();

        //Get atributos:
        System.out.println(animal1.getNombre());
        System.out.println(animal2.getNombre());

        //Set atributos:
        animal1.setNombre("Jirafa");
        System.out.println("Ahora el Gato es una " + animal1.getNombre() + "." );

        //Llamar métodos:
        animal2.comunicarse();
        animal1.dormir();

        System.out.println("--------");
        //Más pruebas con la clase Cancion:
        Cancion c1 = new Cancion("Mediterráneo", "Serrat", 1971);
        System.out.println(c1.getTitulo()+","+c1.getArtista()+","+ c1.getYear());
        c1.informar();
    }
}