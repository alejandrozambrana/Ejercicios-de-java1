/**
 * Ejercicio 25 
 * Realiza un programa que pida un número por teclado y que luego muestre ese número
 *  al revés.
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio25 {
  public static void main(String[] args) {
     
  System.out.println("ESTE PROGRAMA MUESTRA EL NUMERO INTRODUCIDO AL REVES");

    System.out.print("Introduzca un número entero: " );
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int numero = numeroIntroducido;
    int reves = 0;
    
    do {
      reves = (reves * 10) + (numero % 10);
      numero = numero / 10;
    } while (numero >= 0);
   
    System.out.println("El numero introducido es " + numeroIntroducido + " al reves es " + reves);
  }
}


