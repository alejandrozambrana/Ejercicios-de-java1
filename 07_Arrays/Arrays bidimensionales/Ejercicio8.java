/**
 * 
 * Ejercicio 8
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
 * podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil
 * se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican
 * con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
 * 
 * @author Alejandro Zambrana Naranjo
 * 
 */
 
import java.util.Scanner;

public class Ejercicio8 {  
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String[][] tablero = new String[9][9]; // la fila 0 y la columna 0 no se utilizan
    int fila;
    int columna;
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String blanco = "\033[37m";
    String BLANCA = verde + " ■";
    String NEGRA = naranja + " ■";
    String casilla;
    
    
    //pintar tablero
    for(fila = 1; fila < 9; fila++){
      System.out.print(blanco + fila);
      for(columna = 1; columna < 9; columna++){
        if ((fila % 2) == 1) { // fila impar
          if ((columna % 2) == 1) { // columna impar
            casilla = BLANCA;
          } else { // columna par
            casilla = NEGRA;
          }
        } else { // fila par
          if ((columna % 2) == 1) {
            casilla = NEGRA;
          } else { 
            casilla = BLANCA;
          }
        }
      System.out.print(casilla);
      tablero[fila][columna] = casilla;
      }
      System.out.println();
    }
    System.out.println(blanco + "  a b c d e f g h");
    
     int filaAlfil;
     int columnaAlfil;
    do{
      System.out.print("Introduzca una cordenada, por favor: ");
      String cordenadaintroducida = s.nextLine();
      filaAlfil = (int)(cordenadaintroducida.charAt(0)) - 96;//dice en que fila se posiciona el alfil
      columnaAlfil = Integer.parseInt(cordenadaintroducida.charAt(1) + "");//dice en que columna se posiciona el alfil
    }while (((filaAlfil < 0) || (filaAlfil > 8)) || ((columnaAlfil < 0) || (columnaAlfil > 8)));
    
    System.out.println("El alfil puede moverse a las siguientes posiciones: ");
    System.out.println("columna | Fila");
    System.out.println("--------------");
    for(fila = 1; fila <= 8; fila++) {
      for(columna = 1; columna <= 8; columna++) {
        if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
              && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
          System.out.print("   " + columna + "    |");
          System.out.println("  " + fila);
        }
      }
    }
     
    
   
  }
}
