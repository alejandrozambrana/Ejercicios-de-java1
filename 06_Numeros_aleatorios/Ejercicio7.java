/**
 * Ejercicio 7 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas 
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio7 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA LA QUINIELA DE FUTBOL");

    String resultadoString =" ";
    
    System.out.println("       Apuesta1  Apuesta2  Apuesta3\n");

    for (int i = 1; i <= 15;i++){
      System.out.printf("%2d.", i);
      
      for(int columna = 0; columna < 3;columna++){
        int resultado =(int)(Math.random()*3)+1;
        switch (resultado){
          case 1:
            resultadoString = "|1  |";
            break;
          case 2:
            resultadoString = "| X |";
            break;
          case 3:
            resultadoString = "|  2|";
            break;
          default:
        }
        System.out.printf("     " + resultadoString);
      }
      System.out.println();
    }
  }
}
