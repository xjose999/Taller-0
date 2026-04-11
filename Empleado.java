//Modelar la información mediante clases y objetos es superior a usar variables sueltas
// porque permite agrupar datos y comportamientos relacionados en una sola unidad lógica,
// facilitando la organización y el mantenimiento del código.

public class Empleado {
    String nombre;
    String cargo;
    double salario;

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre + " | Cargo: " + cargo + " | Salario: $" + salario);
    }

    public static void main(String[] args) {
        Empleado emp1 = new Empleado();

        emp1.nombre = "José Daniel";
        emp1.cargo = "Desarrollador";
        emp1.salario = 3500000.0;

        emp1.mostrarDatos();
    }
}
