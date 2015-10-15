/**
 * Bucle do-while que termina cuando se introduce por teclado un
 * número impar.
 *
 * @author Luis José Sánchez
 */

public class TerminaCuandoEsImpar {
    
  public static void main(String[] args) {
        
    int numero;
    String Pregunta;
      
    do {
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero % 2 == 0) {// comprueba si el número introducido es par
        System.out.println("El numero es par " + numero);
      } else {
        System.out.println("No me gustan los números impares, adiós.");
      }
      System.out.println("Quieres introducir otro numero s/n.");
      Pregunta = System.console().readLine().toLowerCase();
    } while (Pregunta.equals("s"));
  }
}
