/**
 * 
 * Ejercicio 2
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
 * un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
 * columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
 * esquina inferior derecha.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA UNA TABLA");
   
    int [][] num = new int [3][6];
    
    num[0][1] =30;
    num[0][2] =2;
    num[0][5] =5;
    num[1][0] =75;
    num[1][4] =0;
    num[2][2] =-2;
    num[2][3] =9;
    num[2][5] =11;
    
    System.out.print("Array num   Columna 0  Columna 1  Columna 2  Columna 3  Columna 4  Columna 5\n");
    
    for(int fila = 0; fila < 3; fila++){
      System.out.print("Fila " + fila);
      
      for (int columna = 0; columna < 6; columna++){
        System.out.printf("%11d", num[fila][columna]);
      }
      System.out.println();
    }
  }
}
