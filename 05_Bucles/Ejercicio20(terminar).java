/**
 * Ejercicio 20
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio20 {
  public static void main(String[] args) {
     
    System.out.println("ESTE PROGRAMA PINTA UNA PIRAMIDE HUECA POR PANTALLA");
     
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


