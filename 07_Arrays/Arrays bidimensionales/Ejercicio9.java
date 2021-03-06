/**
 * 
 * Ejercicio 9
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
 * posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas
 * y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz
 * original como la matriz resultado, ambas con los números convenientemente alineados.
 * 
 * @author Alejandro Zambrana Naranjo
 * 
 */
 
import java.util.Scanner;

public class Ejercicio9 {  
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[][] matriz = new int[12][12]; 
    int columnas;
    int filas;
    int movimiento;
    int aux;
    int aux2;
     
    // genera el array y lo muestra
    System.out.println("                      Matriz original");
    System.out.println("-------------------------------------------------------------");
    for(filas = 0; filas < 12; filas++){
      for(columnas = 0; columnas < 12; columnas++){
        matriz[filas][columnas] = (int)(Math.random()*101);
        System.out.printf("%5d", matriz[filas][columnas]);
      }
    System.out.println();
    }
    
    //rotar
    for(movimiento = 0; movimiento < 6; movimiento++) {
      
      // rota por arriba
      aux = matriz[movimiento][11 - movimiento];
      for (filas = 11 - movimiento; filas > movimiento; filas--) {
        matriz[movimiento][filas] = matriz[movimiento][filas - 1];
      }
       // rota por la derecha      
      aux2 = matriz[11 - movimiento][11 - movimiento];
      for (filas = 11 - movimiento; filas > movimiento + 1; filas--) {
        matriz[filas][11 - movimiento] = matriz[filas - 1][11 - movimiento];
      }
      matriz[movimiento + 1][11 - movimiento] = aux;
      
      // rota por abajo
      aux = matriz[11 - movimiento][movimiento];
      for (filas = movimiento; filas < 11 - movimiento - 1; filas++) {
        matriz[11 - movimiento][filas] = matriz[11 - movimiento][filas + 1];
      }
      matriz[11 - movimiento][11 - movimiento - 1] = aux2;
        
      // rota por la izquierda
      for (filas = movimiento; filas < 11 - movimiento - 1; filas++) {
        matriz[filas][movimiento] = matriz[filas + 1][movimiento];
      }
      matriz[11 - movimiento - 1][movimiento] = aux;

    }
    
    // muestra el array resultante
    System.out.println();
    System.out.println("                      Matriz Resultado");
    System.out.println("-------------------------------------------------------------");
    for(filas = 0; filas < 12; filas++){
      for(columnas = 0; columnas < 12; columnas++){
        System.out.printf("%5d", matriz[filas][columnas]);
      }
    System.out.println();
    }
  }
}
