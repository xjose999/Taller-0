public class Mascota {
    String nombre;
    String especie;
    int edad;

    public void mostrarMascota() {
        System.out.println("Su mascota se llama " + nombre);
        System.out.println("Su mascota es de raza " + especie);
        System.out.println("Su mascota tiene " + edad);
    }

    public static void main (String[] args) {

        Mascota mascota = new Mascota();
        mascota.nombre = "Firulais";
        mascota.especie = "Coyote";
        mascota.edad = 5;

        mascota.edad = 7;

        mascota.mostrarMascota();

    }

}