public class Lampara {
    String marca;
    boolean encendida;

    public Lampara() {
        this.marca = "Generica";
        this.encendida = false;
    }

    public Lampara(String marca, boolean encendida) {
        this.marca = marca;
        this.encendida = encendida;
    }

    public void mostrarEstado() {
        String estado = encendida ? "Encendida" : "Apagada";
        System.out.println("Lampara marca: " + marca + " | Estado: " + estado);
    }

    public static void main(String[] args) {
        Lampara miLampara = new Lampara("Philips", true);
        miLampara.mostrarEstado();
    }
}