//La clase es como un molde que define la ESTRUCTURA GENERAL y el objeto son casos ESPECIFICOS que se construyen a partir de ese molde


public class Libro {
    String nombre;
    String genero;

    public void mostrarInfo() {
        System.out.println("El nombre del libro es " + nombre);
        System.out.println("El genero del libro es " + genero);
    }

    public static void main(String[] args) {

        Libro libr1 = new Libro();
        {
            libr1.nombre = "Alicia en el pais de las maravillas";
            libr1.genero = "Infantil";

            Libro libr2 = new Libro();
            libr2.nombre = "Dune";
            libr2.genero = "Fantasia";

            Libro libr3 = new Libro();

            libr3.nombre = "El Pistolero";
            libr3.genero = "Ciencia Ficcion";

            Libro libr4 = new Libro();

            libr4.nombre = "Meridiano de sangre";
            libr4.genero = "Salvaje Oeste";


        }

    }

}