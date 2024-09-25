import java.util.Scanner;

public class CodigoASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);////Se crea un objeto de tipo Scanner llamado scanner. Este objeto se utilizará para leer la entrada del usuario desde la consola (teclado).

        System.out.print("Ingrese un carácter: ");  // Solicita al usuario que ingrese un carácter
        char caracter = scanner.next().charAt(0); // Lee el primer carácter ingresado


        int codigoASCII = (int) caracter; //Convierte el carácter a su código ASCII

        System.out.println("El código ASCII del carácter '" + caracter + "' es: " + codigoASCII);  // Imprime el resultado
    }
}
