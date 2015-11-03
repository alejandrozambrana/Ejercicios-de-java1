/**
 * Ejercicio 8
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea 
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que 
 * salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio8 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA LA QUINIELA DE FUTBOL TRUCADA");

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
          case 4:
            resultadoString = "|1  |";
            break;
          case 5:
            resultadoString = "|1  |";
            break;
          case 6:
            resultadoString = "| X |";
            break;
          default:
        }
        System.out.printf("     " + resultadoString);
      }
      System.out.println();
    }
  }
}
