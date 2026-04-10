public class Celular {
    String marca;
    int bateria;
    boolean prendido;

    public Celular(String marca, int bateriaInicial) {
        this.marca = marca;
        this.bateria = bateriaInicial;
        this.prendido = false;
    }

    public void encender() {
        prendido = true;
    }

    public void apagar() {
        prendido = false;
    }

    public void cargarBateria() {
        bateria = 100;
    }

    public void mostrarEstado() {
        String estado = prendido ? "Encendido" : "Apagado";
        System.out.println("Celular " + marca + " | Bateria: " + bateria + "% | Estado: " + estado);
    }

    public static void main(String[] args) {
        Celular miCelular = new Celular("Samsung", 15);

        miCelular.mostrarEstado();

        miCelular.encender();
        miCelular.cargarBateria();

        System.out.println("Despues de encender y cargar:");
        miCelular.mostrarEstado();
    }
}