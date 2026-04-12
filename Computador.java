//La clase funciona como el plano arquitectónico de un computador, definiendo de manera abstracta qué atributos y comportamientos tendrá cualquier equipo, pero sin poseer una existencia física ni datos reales propios.
// Por el contrario, el objeto es la máquina concreta y tangible que se construye siguiendo ese plano;
// es la instancia que ocupa un espacio real en la memoria y contiene valores específicos, como una marca o una cantidad de RAM determinada.


public class Computador {
    String marca;
    String procesador;
    int ram;

    public void mostrarEspecificaciones() {
        System.out.println("Computador Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + ram + "GB");
    }

    public static void main(String[] args) {
        Computador miPC = new Computador();

        miPC.marca = "Asus";
        miPC.procesador = "Intel Core i3";
        miPC.ram = 8;

        miPC.mostrarEspecificaciones();
    }
}
