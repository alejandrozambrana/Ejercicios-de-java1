/**
 * Ejercicio 23 Escribe un programa que permita ir introduciendo una serie 
 * indeterminada de números mientras su suma no supere el valor 10000. Cuando esto 
 * último ocurra, se debe mostrar el total acumulado, el contador de los números 
 * introducidos y la media.
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio23 {
  public static void main(String[] args) {
     
    System.out.println("MUESTRA POR PANTALLA LOS NUMEROS PRIMOS DEL 2 AL 100");
      
    boolean primo = true;
    
    for (int i = 2; i <= 100 ;i++){
      
      // comprueba si i es primo
      primo = true;
      for (int n = 2; n < i; n++){
        if (i%n == 0) primo = false;
      }
      //muestra por pantalla los numeros primos
      if (primo){
        System.out.print(i + ", ");
        
      }
    } 
  }
}


