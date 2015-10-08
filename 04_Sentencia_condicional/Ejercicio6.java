/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto 
 * desde una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s2
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("Calcula el tiempo que tarda en caer un objento desde una altura ");
  
    System.out.print("Introduzca la altura (h) en metros: ");
      int h = Integer.parseInt(System.console().readLine());

    if (h > 0){
      System.out.print("El tiempo que tarda en caer un objeto ");
      System.out.print("desde " + h + "m. es: ");
      System.out.printf("%.2f segundos", Math.sqrt((2.0*h)/9.81));
    }else{
      System.out.print("Altura incorrecta.");
    }
  }
}

