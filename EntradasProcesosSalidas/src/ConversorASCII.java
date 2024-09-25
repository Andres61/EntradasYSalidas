import java.util.Scanner;

public class ConversorASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        System.out.print("Ingrese un número entre 1 y 255: "); // Solicita al usuario que ingrese un número
        int codigoASCII = scanner.nextInt(); // Lee el número ingresado y lo almacena en la variable codigoASCII

        // Validar que el número esté dentro del rango válido (1-255)
        if (codigoASCII >= 1 && codigoASCII <= 255) {
            char caracter = (char) codigoASCII; // Convertir el código ASCII a su correspondiente carácter
            System.out.println("El carácter correspondiente al código ASCII " + codigoASCII + " es: " + caracter);
        } else {
            System.out.println("El número ingresado está fuera del rango válido (1-255).");
        }
    }
}
