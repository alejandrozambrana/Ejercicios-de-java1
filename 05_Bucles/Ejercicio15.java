/**
 * Ejercicio 15
 * Escribe un programa que dados dos números, uno real (base) y un entero 
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y 
 * el 5, se deberán mostrar 2^1 , 2^2 , 2^3 , 2^4 y 2^5 .
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio15 {
  public static void main(String[] args) {
     
    System.out.println("ESTE PROGRAMA CALCULA POTENCIAS");
    System.out.println("Introduzca la base: ");
    int base = Math.abs(Integer.parseInt(System.console().readLine()));
    
    System.out.println("Introduzca un exponente: ");
    int exponentefinal = Integer.parseInt(System.console().readLine());
        
    int potencia;
    int exponente;
    
    if (exponentefinal >= 0) {
      for (int n = 1; n <= exponentefinal; n++){
        
        potencia = 1;
        exponente = n;
        
          for (int x = 0; x < exponente; x++ ) {
            
            potencia = potencia * base;
            
          } 
      
        System.out.println(base + "^" + exponente + " = " + potencia);
      }
    } else {
        System.out.println("El exponente introducido es negatico");
      }
  }
}

