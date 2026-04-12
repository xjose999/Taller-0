public class Vehiculo {
    String marca;
    String modelo;
    int velocidad;

    public Vehiculo(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public Vehiculo(Vehiculo otro) {
        this.marca = otro.marca;
        this.modelo = otro.modelo;
        this.velocidad = otro.velocidad;
    }

    public void mostrarEstado() {
        System.out.println("Su auto es un " + marca);
        System.out.println("Su auto es modelo " + modelo);
        System.out.println("Su auto va a " + velocidad);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Vehiculo original = new Vehiculo("Mazda", "2024", 80);

        Vehiculo copia = new Vehiculo(original);

        original.mostrarEstado();
        copia.mostrarEstado();
    }
}