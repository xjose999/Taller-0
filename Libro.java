public class Libro {
    String nombre;
    String genero;


    public Libro(String nombreInicial, String generoInicial) {
        nombre = nombreInicial;
        genero = generoInicial;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + nombre);
        System.out.println("Género: " + genero);
    }

    public static void main(String[] args) {

        Libro miLibro = new Libro("Don Quijote", "Clasico");


        miLibro.mostrarInfo();
    }
}