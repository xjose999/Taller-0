public class Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    public void abordar(int cantidad) {
        pasajeros = pasajeros + cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Aerolinea: " + aerolinea);
        System.out.println("Destino: " + destino);
        System.out.println("Pasajeros a bordo: " + pasajeros);
    }

    public static void main(String[] args) {
        Avion miVuelo = new Avion();

        miVuelo.aerolinea = "Avianca";
        miVuelo.destino = "Cartagena";
        miVuelo.pasajeros = 50;

        System.out.println("Estado inicial:");
        miVuelo.mostrarInformacion();

        miVuelo.abordar(25);

        System.out.println("Despues del abordaje:");
        miVuelo.mostrarInformacion();
    }
}