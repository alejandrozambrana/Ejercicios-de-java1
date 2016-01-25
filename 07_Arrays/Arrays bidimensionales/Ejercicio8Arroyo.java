/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JoséAntonio
 */
public class Ejercicio8Arroyo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int [][] tablero = new int[8][8];
    int x;
    int y;
    
    do{
      System.out.println("Introduzca la posición del alfil: ");
      Scanner s = new Scanner(System.in);
      String pos = (s.nextLine()).toLowerCase();
      
      x = (int)(pos.charAt(0)) - 97;
      y = Integer.parseInt(String.valueOf(pos.charAt(1)));
      
    }while(((x < 0) || (x > 8)) || ((y > 8) || (y < 0)));
    
    System.out.println("El alfil puede moverse a las siguientes posiciones: ");
    
    int columna;
    int fila;
    
    columna = x;
    fila = y;
    
    //para mover 
    for(int i = columna - 1; i >= 0 && fila > 1; i--){
      System.out.print((char)(i+97));
      System.out.print(--fila);
      System.out.print(" - ");
    }
    
    columna = x;
    fila = y;
    
    for(int i = columna - 1; i >= 0 && fila < 8; i--){
      System.out.print((char)(i+97));
      System.out.print(++fila);
      System.out.print(" - ");
    }
    
    columna = x;
    fila = y;
    
    for(int i = columna + 1; fila < 8 && i < 8; i++){
      System.out.print((char)(i+97));
      System.out.print(++fila);
      System.out.print(" - ");
    }
    
    columna = x;
    fila = y--;
    
    for(int i = columna + 1; fila > 1 && i < 8; i++){
      System.out.print((char)(i+97));
      System.out.print(--fila);
      System.out.print(" - ");
    }
  }
  
}
