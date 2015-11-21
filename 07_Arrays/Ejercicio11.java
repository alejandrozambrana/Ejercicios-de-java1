/**
 * 
 * Ejercicio 11
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 * A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
 * para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
 * desplazando el resto de números (los que no son primos) de tal forma que no se pierda
 * ninguno. Al final se debe mostrar el array resultante.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio11 {

  public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA ALMACENA NUMEROS PRIMOS AL PRINCIPIO DE UN ARRAY Y NO PRIMOS AL FINAL");
    
    int[] numero = new int[10];
    int[] arrayPrimo = new int[10];
    int[] arraynoPrimo = new int[10];
    boolean primo = true;
    int i;
    int numPrimo = 0;
    int noPrimo = 0;
    
    System.out.println("Introduze 10 numeros enteros: ");
    
    for(i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    //genera y muestra el array original
    System.out.println("Array original:");
    for(i = 0; i < 10; i++) {
      System.out.print(numero[i] + " " ); 
      //Comprueba los numeros primos
      primo = true;
      for (int j = 2; j < numero[i] - 1; j++) {
        if (numero[i] % j == 0) primo = false;
      }
      //mete los numeros primos en un array y los no primo en otro
      if(primo){
         arrayPrimo[numPrimo++] = numero[i];
      } else {
        arraynoPrimo[noPrimo++] = numero[i];
      }
    }
    System.out.println();
    
    //Pone los Primos primeros
    for (i = 0; i < numPrimo; i++){
      numero[i] = arrayPrimo[i];
    }
    
    //meter los no primo luego
    for (i = numPrimo; i < numPrimo + noPrimo; i++) {
      numero[i] = arraynoPrimo[i - numPrimo];
    }
    
    System.out.println("Array Con primos primeros y no primos despues:");
    for (i = 0; i < 10; i++) {
      System.out.print(numero[i] + " ");
    }
  }
}
