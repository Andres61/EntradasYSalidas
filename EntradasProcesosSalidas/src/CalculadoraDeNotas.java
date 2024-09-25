import java.util.Scanner;

public class CalculadoraDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Se crea un objeto de tipo Scanner llamado scanner. Este objeto se utilizará para leer la entrada del usuario desde la consola (teclado).

        /*
        1. Ingresar por teclado y por separado en dos variables, sus nombres y apellidos respectivamente,
        mostrar en orden contrario al que se ingresaron, es decir apellidos y nombres, Ejm;
        ENTRADA: JHON JAIRO
        OROZCO DAVILA
        SALIDA => OROZCO DAVILA JHON JAIRO
         */
        System.out.println("Ingrese su nombre"); //Esta línea muestra en la consola el mensaje "Ingrese su nombre" para solicitar al usuario que introduzca su nombre.
        String nombre = scanner.nextLine();//Aquí es donde se almacena el nombre ingresado por el usuario en la variable nombre. El método nextLine() del objeto scanner lee toda una línea de texto desde la entrada estándar (generalmente el teclado) y la asigna a la variable.
        System.out.println("Ingrese sus apellidos");//De manera similar, esta línea muestra el mensaje "Ingrese sus apellidos" para pedir al usuario que introduzca sus apellidos.
        String apellidos = scanner.nextLine();//Esta línea almacena los apellidos ingresados por el usuario en la variable apellidos.
        System.out.println(apellidos + " " +nombre );


    }
}

