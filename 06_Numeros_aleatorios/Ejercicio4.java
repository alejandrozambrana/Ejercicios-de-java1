/**
 * 
 * Ejercicio 4
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados 
 * por espacios.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio4 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA 20 NUMEROS ALEATORIOS ENTRE 0 y 10");

    for (int i = 1; i <= 20; i++){
      System.out.print((int)(Math.random()*11) + " ");
    }
    
    
  }
}
