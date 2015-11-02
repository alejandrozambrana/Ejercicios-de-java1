/**
 * Ejercicio 28
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio28 {
  public static void main(String[] args) {
     
  System.out.println("ESTE PROGRAMA EL FACTORIAL DE UN NUMERO ENTERO");
  System.out.print("Introduzca un número entero para calcular su factorial: ");
  int numero = Integer.parseInt(System.console().readLine());

  System.out.print(numero + "! = ");
  
  int factorial = 1;

    for (int i = 1; i <= numero; i++){
      factorial *= i;
      if (i < numero){
        System.out.print(i + " x ");
      }else{
        System.out.print(i + " = ");
      }
    }
    System.out.print(factorial);
  }
}


