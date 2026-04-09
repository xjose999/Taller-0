public class Vehiculo {
    String marca;
    String modelo;
    String velocidad;

    public void mostrarEstado() {
        System.out.println("Su auto es un " + marca);
        System.out.println("Su auto es modelo " + modelo);
        System.out.println("Su auto va a " + velocidad);
    }

    public static void main (String[] args) {
        Vehiculo vehic1 = new Vehiculo();
        vehic1.marca = "Su auto es un Mazda";
        vehic1.modelo = "Su auto es modelo del 98";
        vehic1.velocidad = "Su auto va a 130km por hora";

        Vehiculo vehic2 = new Vehiculo();
        vehic2.marca = "Su auto es un Suzuki";
        vehic2.modelo = "Su auto es modelo del 2000";
        vehic2.velocidad = "Su auto va a 120km por hora";


        vehic1.mostrarEstado();
        vehic2.mostrarEstado();

    }

}