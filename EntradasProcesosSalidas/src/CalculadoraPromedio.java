import java.util.Scanner;

public class CalculadoraPromedio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Entradas: Pedir al usuario que ingrese tres números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        // Proceso: Calcular el promedio
        double promedio = (numero1 + numero2 + numero3) / 3;

        // Salida: Mostrar el resultado
        System.out.println("El promedio de los tres números es: " + promedio);
    }
}
