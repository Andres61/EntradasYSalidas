import java.util.Scanner;

/*
  Calcula el área de un triángulo dado su base y altura.
 */
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario


        // Entrada de datos
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble(); // Lee la base ingresada por el usuario

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble(); // Lee la altura ingresada por el usuario

        // Proceso: Calcular el área
        double area = (base * altura) / 2; // Fórmula para calcular el área de un triángulo

        // Salida: Mostrar el resultado
        System.out.println("El área del triángulo es: " + area);
    }
}
