public class Mascota {
    String nombre;
    String especie;
    int edad;

    public void mostrarMascota() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }


    public void cumplirAnios() {

        edad = edad + 1;
        System.out.println("¡Feliz cumpleaños " + nombre + "!");
    }

    public static void main (String[] args) {

        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Firulais";
        mascota1.especie = "Perro";
        mascota1.edad = 3;


        mascota1.mostrarMascota();


        mascota1.cumplirAnios();


        mascota1.mostrarMascota();
    }
}