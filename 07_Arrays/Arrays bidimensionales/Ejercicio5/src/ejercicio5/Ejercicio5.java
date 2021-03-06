/**
 * 
 * Ejercicio 5
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
 * deberá dar la posición tanto del máximo como del mínimo.
 * 
 * @author Alejandro Zambrana Naranjo
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
        
    System.out.println("ESTE PROGRAMA MUESTRA UNA HOJA DE CALCULO Y DA EL NUMERO MAXIMO Y MINIMO");
    
    int [][] num = new int [6][10];
    
    int filas;
    int columnas;
    int minimo = Integer.MAX_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    int maximo = Integer.MIN_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;
    
    //pinta tabla
    System.out.println();
    System.out.println("         col1    col2    col3    col4    col5    col6    col7    col8    col9    col10");
    System.out.print("      ---------------------------------------------------------------------------------");
    System.out.println();
    for(filas = 0; filas < 6; filas++){
      System.out.print("|  F" + filas +"  ");
      for(columnas = 0; columnas < 10; columnas++){
        num [filas][columnas] = (int)(Math.random()*1001);
        System.out.printf("|%5d  ", num[filas][columnas]);
     
      //Calcilar cual es el minimo
      if(num[filas][columnas] < minimo){
      minimo = num[filas][columnas];
      filaMinimo = filas;
      columnaMinimo = columnas + 1;
      }
      
      //Calcilar cual es el maximo
      if(num[filas][columnas] > maximo){
      maximo = num[filas][columnas];
      filaMaximo = filas;
      columnaMaximo = columnas + 1;
      }
      
      }
      System.out.print("|");
      System.out.println();
    }
    System.out.print("      ---------------------------------------------------------------------------------");
    System.out.println();
    
    System.out.println("El minimo es " + minimo + " esta en la cordenada Fila "+ filaMinimo + " Columna " + columnaMinimo);
    System.out.println("El maximo es " + maximo + " esta en la cordenada: Fila "+ filaMaximo + " Columna " + columnaMaximo);
  }
}
