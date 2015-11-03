/**
 * Ejercicio 11
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben 
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. 
 * Al final aparecerá el número de suspensos, el número de suficientes, el número 
 * de bienes, etc.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio11 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA NOTAS AL AZAR");
    
    int suspensos = 0;
    int suficientes = 0;
    int numbien = 0;
    int notables = 0;
    int sobresalientes = 0;
    
    for(int i = 0; i < 20;i++){
      int notas = (int)(Math.random()*5)+1;
        switch(notas){
          case 1:
            System.out.println("suspenso ");
            suspensos++;
            break;
          case 2:
            System.out.println("suficiente ");
            suficientes++;
            break;
          case 3:
            System.out.println("bien ");
            numbien++;
            break;
          case 4:
            System.out.println("notable ");
            notables++;
            break;
          case 5:
            System.out.println("sobresaliente ");
            sobresalientes++;
            break;
          default:
        }
    }
      System.out.println("Hay " + suspensos + " Suspensos");
      System.out.println("Hay " + suficientes + " Suficientes");
      System.out.println("Hay " + numbien + " Bienes");
      System.out.println("Hay " + notables + " notables");
      System.out.println("Hay " + sobresalientes + " Sobresalientes");
    
  }
}
