/**
 * Ejercicio 28
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio28 {
  public static void main(String[] args) {
     
  System.out.println("ESTE PROGRAMA EL FACTORIAL DE UN NUMERO ENTERO");

    int numeroIntroducido; 
    
    do {
      System.out.print("Introduzca un número mayor o igual que 0: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
        if (numeroIntroducido < 0){
          System.out.println("El número introducido no es correcto.");
        }
    }while (numeroIntroducido < 0);
    
    int factorial = numeroIntroducido;
    
    if ( numeroIntroducido == 0){
      System.out.println("El factorial del " + numeroIntroducido + " es 1.");
    } else {
      for (int i = 1; i < numeroIntroducido; i++) {
      factorial = factorial * i;
      }
      
    System.out.println("El factorial del " + numeroIntroducido + " es " + factorial);
    }
  }
}


