/**
 * Ejercicio 26 
 * Realiza un programa que pida primero un número y a continuación un 
 * dígito. El programa nos debe dar la posición (o posiciones) contando de izquierda
 * a derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio26 {
  public static void main(String[] args) {
     
  System.out.println("ESTE PROGRAMA LA POSICION DE UN NUMERO");

    System.out.print("Introduzca un número entero: " );
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca un digito: " );
    int digito = Integer.parseInt(System.console().readLine());
    
    int numero = numeroIntroducido;
    int reves = 0;
    int posicion = 1;
    
    // voltea el número    
    do {
      reves = (reves * 10) + (numero % 10);
      numero = numero / 10;
    } while (numero > 0);
    
    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece en las siguientes posiciones: ");
    
    // comprueba la posición
    do {
      if ((reves % 10) == digito){
        System.out.print(posicion + " ");
      }
      reves = reves / 10;
      posicion++;
    } while (reves > 0);
    
    
  }
}


