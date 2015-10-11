/**
 * Ejercicio 15 
 * Escribe un programa que pinte una pirámide rellena con un carácter 
 * introducido por teclado que podrá ser una letra, un número o un símbolo
 * como *, +, -, $, &, etc. El programa debe permitir al usuario mediante un 
 * menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia 
 * abajo, hacia la izquierda o hacia la derecha.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.println("PINTAR PIRAMIDE");
        
    System.out.print("Introduce el caracter de relleno: ");
    String e = System.console().readLine();
    
    System.out.println("Elige donde quieres que este el vertice ");
    System.out.println("1-Derecha");
    System.out.println("2-Izquierda");
    System.out.println("3-Arriba");
    System.out.println("4-Abajo");
    int menu = Integer.parseInt(System.console().readLine());
    
    switch(menu) {
      case 1:
        System.out.println(e);
        System.out.println(e + " " + e);
        System.out.println(e + " " + e + " " + e);
        System.out.println(e + " " + e );
        System.out.println(e);
        break;
      case 2:
        System.out.println( "    " + e);
        System.out.println( "  " + e +" " + e);
        System.out.println( e + " " + e + " " + e);
        System.out.println( "  " + e + " " + e);
        System.out.println( "    " + e);
        break;  
      case 3:
        System.out.println("    " + e);
        System.out.println("  " + e + " " + e + " "+ e);
        System.out.println(e + " " + e + " " + e + " " + e + " " + e);
        break; 
      case 4:
        System.out.println(e + " " + e + " " + e + " " + e + " " + e);
        System.out.println("  " + e + " " + e + " "+ e);
        System.out.println("    " + e);
        break;
        default:
    }
  }
}
