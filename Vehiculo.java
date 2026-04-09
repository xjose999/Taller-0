public class Vehiculo {
    String marca;
    String modelo;
    int velocidad;

    public void mostrarEstado() {
        System.out.println("Su auto es un " + marca);
        System.out.println("Su auto es modelo " + modelo);
        System.out.println("Su auto va a " + velocidad);
    }

}