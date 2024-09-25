import java.util.Scanner;

/*
        4. Leer las tres notas de los parciales y mostrar su definitiva aplicando los respectivos
        porcentajes: Primer y Segundo Parcial 25%, Final del 20% y los Talleres 30% (tres talleres por
        separado)
         */
public class Calificaciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Se crea un objeto de tipo Scanner llamado scanner. Este objeto se utilizará para leer la entrada del usuario desde la consola (teclado).

        //El código utiliza scanner.nextDouble() para leer los valores ingresados por el usuario, ya que las notas pueden ser números decimales.
        System.out.println("Ingrese la nota del primer parcial");//Se muestra un mensaje en la consola solicitando al usuario que ingrese la nota del primer parcial.

        //Se utiliza scanner.nextDouble() para leer el valor ingresado por el usuario y almacenarlo en la variable primerParcial.
        double primerParcial = scanner.nextDouble(); //Almacena la nota del primer parcial. Se utiliza scanner.nextDouble() para leer el valor ingresado por el usuario y almacenarlo en la variable primerParcial.

        //Se repiten los mismos pasos para solicitar y almacenar las notas del segundo parcial, final y talleres.
        System.out.println("Ingrese la nota del segundo parcial");
        double segundoParcial = scanner.nextDouble();//Almacena la nota del segundo parcial.
        System.out.println("Ingrese la nota del final");
        double notaFinal = scanner.nextDouble();//Almacena la nota del final.
        System.out.println("Ingrese la nota de los tres talleres");

        double talleres = scanner.nextDouble();//Almacena la nota de los tres talleres.
        double definitiva = (primerParcial * 0.25) + (segundoParcial * 0.25) + (notaFinal * 0.2) + (talleres * 0.3);//Almacena la nota definitiva calculada.
        System.out.println("Nota definitiva: " + definitiva);
    }
}
