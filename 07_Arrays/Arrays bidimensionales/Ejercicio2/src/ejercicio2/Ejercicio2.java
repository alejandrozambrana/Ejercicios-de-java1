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

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
    System.out.println("ESTE PROGRAMA MUESTRA UNA HOJA DE CALCULO");
   
    int [][] num = new int [4][5];
    
    int filas;
    int columnas;
    
    System.out.println("Introduce 20 numeros: ");
    //introducir datos
    for(filas = 0; filas < 4; filas++){
      for(columnas = 0; columnas < 5; columnas++){
        System.out.print("Fila " + filas + ", columna " + columnas + ": ");
        num[filas][columnas] = Integer.parseInt(s.nextLine());
      }
    }
    //muestra datos y suma filas
    int sumaFilas = 0;
    System.out.println();
    System.out.println("  columna1   columna2   columna3   columna4   columna5   Total");
    System.out.print("----------------------------------------------------------------");
    System.out.println();
    for(filas = 0; filas < 4; filas++){
      sumaFilas = 0;
      for(columnas = 0; columnas < 5; columnas++){
        System.out.printf("|%7d   ", num[filas][columnas]);
        sumaFilas = sumaFilas + num[filas][columnas];
      }
      System.out.printf("|%7d\n", sumaFilas);
    }
    System.out.print("----------------------------------------------------------------");
    System.out.println();
    
    //suma de columnas
    int sumacolumnas = 0;
    int sumatotal = 0;
    for(columnas = 0; columnas < 5; columnas++){
      sumacolumnas = 0;
      for(filas = 0; filas < 4; filas++){
          sumacolumnas = sumacolumnas + num[filas][columnas];
      }
      sumatotal = sumatotal + sumacolumnas;
      System.out.printf("|%7d   ", sumacolumnas);
      
    }
    System.out.printf("|%7d   ", sumatotal);
    }
    
}
