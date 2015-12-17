/**
 * 
 *Ejercicio 3
 * Modifica el programa anterior de tal forma que los números que se introducen en el array
 * se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author Alejandro Zambrana Naranjo
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
    System.out.println("ESTE PROGRAMA MUESTRA UNA HOJA DE CALCULO ALEATORIO");
   
    int [][] num = new int [4][5];
    
    int filas;
    int columnas;
    
    //Genera numeros aleatorios
    for (filas = 0; filas < 4; filas++){
      for (columnas = 0; columnas < 5; columnas++){
      num[filas][columnas] = (int)(Math.random()*900)+ 100;
      }
    }
    
    //muestra datos y suma filas
    int sumaFilas ;
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
    int sumacolumnas;
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

