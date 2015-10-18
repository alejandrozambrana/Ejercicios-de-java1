/**
 * Ejercicio 10
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio10{
  public static void main(String[] args) {
    
    double numeroIntroducido = 0;
    double numeros = 0;
    double suma = 0;
     
    System.out.println("CALCULA LA MEDIA DE LOS NUMEROS POSITIVOS");
    System.out.println("Introduzca números (para parar introduce un número negativo):");
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
      } while (numeroIntroducido >= 0);
      
      System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido) / (numeros - 1));
  }
}

