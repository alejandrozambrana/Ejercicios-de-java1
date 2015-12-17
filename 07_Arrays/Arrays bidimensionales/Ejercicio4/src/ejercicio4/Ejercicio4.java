/**
 * 
 * Ejercicio 4
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma total
 * aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el ordenador
 * se queda “pensando” antes de mostrar los números.
 * 
 * @author Alejandro Zambrana Naranjo
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

  public static void main(String[] args) 
    throws InterruptedException {
    
    Scanner s = new Scanner(System.in);
        
    System.out.println("ESTE PROGRAMA MUESTRA UNA HOJA DE CALCULO ALEATORIO CON RETARDO");
    
    int [][] num = new int [4][5];
    
    int filas;
    int columnas;
    
    //Genera numeros aleatorios
    for (filas = 0; filas < 4; filas++){
      for (columnas = 0; columnas < 5; columnas++){
      num[filas][columnas] = (int)(Math.random()*900)+ 100;
      }
    }
    Thread.sleep(1150);
    //muestra datos y suma filas
    int sumaFilas ;
    System.out.println();
    System.out.println("  columna1   columna2   columna3   columna4   columna5   Total");
    System.out.print("----------------------------------------------------------------");
    System.out.println();
    for(filas = 0; filas < 4; filas++){
      sumaFilas = 0;
      for(columnas = 0; columnas < 5; columnas++){
        Thread.sleep(1150);
        System.out.printf("|%7d   ", num[filas][columnas]);
        sumaFilas = sumaFilas + num[filas][columnas];
      }
      Thread.sleep(1150);
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
      Thread.sleep(1150);
      sumatotal = sumatotal + sumacolumnas;
      System.out.printf("|%7d   ", sumacolumnas);
      
    }
    Thread.sleep(1150);
    System.out.printf("|%7d   ", sumatotal); 
  }
}
