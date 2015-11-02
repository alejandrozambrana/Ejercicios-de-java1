/**
 * 
 * Ejercicio 5 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados
 * por espacios. Muestra también el máximo, el mínimo y la media de esos números.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio5 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA 50 NUMEROS ALEATORIOS ENTRE 100 y 199");

    int numeroMaximo = 100;
    int numeroMinimo = 199;
    int suma = 0;
     
    for (int i = 1; i <= 50; i++){
      int numero = (int)(Math.random()*100) + 100;
      System.out.print(numero + " ");
    
      if(numero > numeroMaximo){
        numeroMaximo = numero;
      }
      
      if(numero < numeroMinimo){
        numeroMinimo = numero;
      }
      suma = suma + numero;
    }
    
    System.out.println();
    System.out.println("El numero maximo es: " + numeroMaximo);
    System.out.println("El numero minimo es: " + numeroMinimo);
    System.out.println("La media es: " + suma / 50);
  }
}
