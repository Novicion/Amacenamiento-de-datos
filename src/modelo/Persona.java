package modelo;
import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    String nombre;
    String dni;
    String celular;
    String infoAdicional;

    public Persona(String nombre, String dni, String celular, String infoAdicional) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
        this.infoAdicional = infoAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getCelular() {
        return celular;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "DNI: " + dni + "\n" +
                "Celular: " + celular + "\n" +
                "Información adicional: " + infoAdicional + "\n";
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar lista de personas");
            System.out.println("3. Salir");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese DNI:");
                    String dni = scanner.nextLine();
                    System.out.println("Ingrese número de celular:");
                    String celular = scanner.nextLine();
                    System.out.println("Ingrese información adicional:");
                    String infoAdicional = scanner.nextLine();
                    Persona persona = new Persona(nombre, dni, celular, infoAdicional);
                    personas.add(persona);
                    break;
                case "2":
                    System.out.println("Lista de personas:");
                    for (Persona p : personas) {
                        System.out.println(p.toString());
                    }
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (!opcion.equals("3"));
    }
}
