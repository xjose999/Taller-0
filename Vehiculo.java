public class Vehiculo {
    String marca;
    String modelo;
    int velocidad;


    public void acelerar() {
        velocidad = velocidad + 10;
    }

    public void frenar() {
        velocidad = velocidad - 10;
    }


    public void mostrarEstado() {
        System.out.println("Su auto es un " + marca);
        System.out.println("Su auto es modelo " + modelo);
        System.out.println("Su auto va a " + velocidad + "por hora");
    }

    public static void main (String[] args) {
        Vehiculo vehic1 = new Vehiculo();
        vehic1.marca = "Su auto es un Mazda";
        vehic1.modelo = "Su auto es modelo del 98";
        vehic1.velocidad = 0;



        vehic1.acelerar();
        vehic1.frenar();
        vehic1.mostrarEstado();



        System.out.println("El auto ha frenado ");
    }

}