/**
 * Ejercicio 19
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir 
 * por teclado. El carácter con el que se pinta la pirámide también se debe pedir 
 * por teclado.
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio19 {
  public static void main(String[] args) {
     
    System.out.println("ESTE PROGRAMA PINTA UNA PIRAMIDE POR PANTALLA");
     
      System.out.print("Introduzca la altura de la piramide : ");
      int altura = Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduzca con que caracter quieres pintar la piramide : ");
      String caracter = System.console().readLine();
     
     int alto = 1;
     int espacios = altura-1;
     
    while (alto <= altura){
      
      //meter espacios
      for (int i = 1; i <= espacios; i++){
        System.out.print(" ");
      }
      
      // pinta la línea
      for (int i = 1; i < alto * 2; i++){
        System.out.print(caracter);
      }
      
      System.out.println();
      
      alto++;
      espacios--;
    }
  }
}


