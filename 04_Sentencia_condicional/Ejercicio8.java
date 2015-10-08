/**
 * Ejercicio 8 
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio8 {
  public static void main(String[] args) {
  
    System.out.println("CALCULA LA MEDIA DE TRES NOTAS ");
    
    System.out.print("Introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
      
    double media = (nota1 + nota2 + nota3) / 3;
    
    System.out.println("La nota media es: " + media);
    
    if (media < 5) {
      System.out.println("Insuficiente");
      }
    if ((media >= 5) && (media < 6)) {
      System.out.print("Suficiente");
      }
    if ((media >= 6) && (media < 7)) {
      System.out.print("Bien");
      }
    if ((media >= 7) && (media < 9)) {
      System.out.print("Notable");
      }
    if (media >= 9) {
      System.out.print("Sobresaliente");
      }

  }
}
