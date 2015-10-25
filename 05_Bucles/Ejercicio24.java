/**
 * Ejercicio 24
 * Escribe un programa que lea un número n e imprima una pirámide de números con n 
 * filas como en la siguiente figura:
 *    1
 *   121
 *  12321
 * 1234321
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio24 {
  public static void main(String[] args) {
     
  System.out.println("MUESTRA UNA PIRAMIDE DE NUMEROS");

    System.out.print("Introduze la altura: " );
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
   
    int altura = 1;
    int espacios = alturaIntroducida - 1;
   
    while (altura <= alturaIntroducida){
     
      //espacios anterior
      for (int i = 1; i <= espacios;i++){
        System.out.print(" ");
      }
     
      //pintar piramide
      for (int i = 1; i < altura; i++){
        System.out.print(i);
      }
      
      //pintar piramide restando numeros
      for (int i = altura; i > 0; i--){
        System.out.print(i);
      }
      
      altura++;
      espacios--;
      
      System.out.println();
    }
  }
}


