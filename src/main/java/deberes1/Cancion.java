package deberes1;

public class Cancion{
    //Atributos:
    String titulo;
    String artista;
    int year;

    //Métodos:

    //Constructor(es)
    public Cancion (String titulo, String artista, int year){
        this.titulo = titulo;
        this.artista = artista;
        this.year = year;
    }

    //Setters (siempre void)
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //Getters (siempre return){
    public String getTitulo(){
        return titulo;
    }
    public String getArtista(){
        return artista;
    }
    public int getYear() {
        return year;
    }

    //Otros
    public void informar(){
        System.out.println("La canción " + this.titulo +
                            " de " + this.artista +
                            " es del año " + this.year + ".");
    }
}

