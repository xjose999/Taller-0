public class Cancion {
    String titulo;
    String artista;
    double duracion;

    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duracion: " + duracion + " minutos");
    }

    public static void main(String[] args) {
        Cancion miCancion = new Cancion("Bohemian Rhapsody", "Queen", 5.55);

        miCancion.mostrarInfo();
    }
}
