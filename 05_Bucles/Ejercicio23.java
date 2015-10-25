/**
 * Ejercicio 23 
 * Escribe un programa que permita ir introduciendo una serie indeterminada de 
 * números mientras su suma no supere el valor 10000. Cuando esto último ocurra, 
 * se debe mostrar el total acumulado, el contador de los números introducidos y la 
 * media.
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio23 {
  public static void main(String[] args) {
     
    System.out.println("MUESTRA EL TOTAL ACUMULADO EL CONTADOR DE LOS NUMEROS INTRODUCIDOS Y LA MEDIA");
    System.out.println("Introduze numeros enteros" );
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000" );
    
    int numeroIntroducidos;
    int suma = 0;
    int numeros = 0;
    
    do{
      numeroIntroducidos = Integer.parseInt(System.console().readLine());
      suma = suma + numeroIntroducidos;
      numeros++;
      
    } while (suma <= 10000);
      
    System.out.println("Ha introducido " + numeros + " numeros");
    System.out.println("Se ha acumulado " + suma);
    System.out.println("La media es " + suma/numeros);
   
  }
}


