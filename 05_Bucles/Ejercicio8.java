/**
 * Ejercicio 7 
 * Realiza el control de acceso a una caja fuerte. La combinación será un número
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no 
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” 
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio7 {
  public static void main(String[] args) {
    
    System.out.println("REALIZA EL CONTROL DE ACCESO A UNA CAJA FUERTE");
      
      int codigo; 
      int intentos = 4;
      
      do {
        System.out.println("Introduce la conbinacion de la caja fuerte(4 digitos): " + intentos + " intentos");
        codigo = Integer.parseInt(System.console().readLine());
        
        intentos--;
        
        if (codigo == 2596) {
          System.out.println("Ha abierto la caja fuerte.");
          break;
        } else {
          System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        }
      } while(intentos > 0);
    }
  }

