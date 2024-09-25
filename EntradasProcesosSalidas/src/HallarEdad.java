import java.util.Scanner;
 /*
        2. Hallar la edad de una persona, conociendo su año de nacimiento; declarar una CONSTANTE
        con el año actual
         */

public class HallarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Se crea un objeto de tipo Scanner llamado scanner. Este objeto se utilizará para leer la entrada del usuario desde la consola (teclado).

        int anoActual = 2024; //Se declara una variable de tipo entero llamada anoActual y se le asigna el valor 2024. Esta variable representa el año actual y se utilizará para calcular la edad.

        System.out.println("Ingrese su año de nacimiento");//Se muestra un mensaje en la consola solicitando al usuario que ingrese su año de nacimiento.

        int anoNacimiento = scanner.nextInt();//Se declara una variable de tipo entero llamada anoNacimiento para almacenar el año de nacimiento ingresado por el usuario. Utiliza el objeto scanner para leer el siguiente número entero ingresado por el usuario y lo asigna a la variable anoNacimiento.
        int edad = anoActual - anoNacimiento;//Se declara una variable de tipo entero llamada edad para almacenar la edad calculada.Se realiza la resta del año actual (anoActual) menos el año de nacimiento (anoNacimiento) y el resultado se asigna a la variable edad.

        System.out.println("Su edad es: " + edad);
    }
}
