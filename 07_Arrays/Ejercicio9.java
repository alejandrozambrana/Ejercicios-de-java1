/**
 * 
 * Ejercicio 9
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
 * con la palabra “par” o “impar” según proceda.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio9 {

  public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA NUMEROS PARES E IMAPRES");
    
    int[] numeros = new int[8];
    int[] par = new int[8]; 
    int[] impar = new int[8]; 
    
    System.out.println("Introduze 8 numeros enteros: ");
    for(int i = 0; i < 8; i++) {
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    for(int i = 0; i < 8; i++) {
      if ((numeros[i] % 2) == 0) {
        System.out.println(numeros[i] + " Par " );
      } else {
        System.out.println(numeros[i] + " Impar " );
      }
    }
  }
}
