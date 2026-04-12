public class Reloj {
    int hora;
    int minuto;
    int segundo;

    public void mostrarHora() {
        System.out.println("Hora actual: " + hora + ":" + minuto + ":" + segundo);
    }

    public static void main(String[] args) {
        Reloj miReloj = new Reloj();

        miReloj.hora = 20;
        miReloj.minuto = 6;
        miReloj.segundo = 15;

        miReloj.mostrarHora();
    }
}
