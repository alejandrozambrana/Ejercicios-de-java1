/**
 * Ejercicio 13
 * Escribe un programa que lea una lista de diez números y determine cuántos 
 * son positivos, y cuántos son negativos.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio13{
  public static void main(String[] args) {
     
    System.out.println("DETERMINA QUE NUMEROS SON POSITIVOS Y CUALES NEGATIVOS");
    System.out.println("Introduzca una lista de 10 números: ");
    
    int numeroIntroducido;
    int positivo = 0;
    int negativo = 0;
    int n = 0;
    
    while ( n < 10 ) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      n++;
      
      if (numeroIntroducido > 0) {
        positivo++;
      } else {
        negativo++;
      }
    }
    System.out.println("Has introducido " + positivo + " positivos y " + negativo + "negativos");
  }
}

