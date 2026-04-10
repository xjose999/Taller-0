public class Lampara {
    String marca;
    boolean encendida;

    public Lampara(String marca) {
        this.marca = marca;
        this.encendida = false;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public void mostrarEstado() {
        String estado = encendida ? "Encendida" : "Apagada";
        System.out.println("La lampara " + marca + " esta " + estado);
    }

    public static void main(String[] args) {
        Lampara miLampara = new Lampara("Xiaomi");

        miLampara.mostrarEstado();

        miLampara.encender();
        miLampara.mostrarEstado();

        miLampara.apagar();
        miLampara.mostrarEstado();
    }
}