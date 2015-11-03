/**
 * Ejercicio 9
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y 
 * que no termine de generar números hasta que no saque el 24. El programa deberá 
 * decir al final cuántos números se han generado.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio9 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA NUMEROS ALEATORIOS HASTA QUE MUESTRE EL NUMERO 24");
    
    int numerosMostrados = 0;
    
    do{
      
      int numeros = (int)(Math.random()*100)+1;
      System.out.println( numeros + " ");
      numerosMostrados++;
      
      if (numeros == 24){
        System.out.println("Ha finalizado el programa.");
        break;
      }
      
    }while ( numerosMostrados < 101);
    System.out.println("Ha mostrado " + numerosMostrados + " numeros");
  }
}
