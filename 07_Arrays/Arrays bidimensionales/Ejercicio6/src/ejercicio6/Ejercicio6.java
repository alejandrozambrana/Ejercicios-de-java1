/**
 * 
 * Ejercicio 6
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 * 
 * @author Alejandro Zambrana Naranjo
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

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
    
    // Genera el contenido del array sin que se repita ningún valor
    boolean repetir;
    int i;
    int j;
      
    for(filas = 0; filas < 6; filas++) {
      for(columnas = 0; columnas < 10; columnas++) {
        do{
          num [filas][columnas] = (int)(Math.random()*1001);
          // Comprueba si el número generado ya está en el array.
          repetir = false;
          for (i = 0; i < 10 * filas + columnas; i++) {
            if (num[filas][columnas] == num[i / 10][i % 10]) {
              repetir = true;
            }
          }
        }while(repetir);
      }
    }
    
    //pinta tabla
    System.out.println();
    System.out.println("         col1    col2    col3    col4    col5    col6    col7    col8    col9    col10");
    System.out.print("      ---------------------------------------------------------------------------------");
    System.out.println();
    for(filas = 0; filas < 6; filas++){
      System.out.print("  F" + filas +"  ");
      for(columnas = 0; columnas < 10; columnas++){
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