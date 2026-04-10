public class Puerta {
    String material;
    boolean abierta;

    public Puerta(String material) {
        this.material = material;
        this.abierta = false;
    }

    public void abrir() {
        abierta = true;
    }

    public void cerrar() {
        abierta = false;
    }

    public void mostrarEstado() {
        String estado = abierta ? "Abierta" : "Cerrada";
        System.out.println("Puerta de " + material + " | Estado: " + estado);
    }

    public static void main(String[] args) {
        Puerta miPuerta = new Puerta("Madera");

        miPuerta.mostrarEstado();

        miPuerta.abrir();
        miPuerta.mostrarEstado();

        miPuerta.cerrar();
        miPuerta.mostrarEstado();
    }
}