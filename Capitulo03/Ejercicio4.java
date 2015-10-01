/**
 * Ejercicio 4
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    
    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );

    int suma;
    suma = primerNumero + segundoNumero;
    int resta;
    resta = primerNumero - segundoNumero;
    int multiplicacion;
    multiplicacion = primerNumero * segundoNumero;
    double division;
    division = ((double)primerNumero / (double)segundoNumero);

      System.out.print("El primer número introducido es " + primerNumero);
      System.out.println(" y el segundo es " + segundoNumero);
      System.out.println("El resultado de la suma es:" + suma);
      System.out.println("El resultado de la resta es:" + resta);
      System.out.println("El resultado de la multiplicacion es:" + multiplicacion);
      System.out.println("El resultado de la division es:" + division);
  }
}
