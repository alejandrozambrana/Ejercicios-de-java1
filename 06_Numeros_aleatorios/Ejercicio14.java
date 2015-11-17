/**
 * Ejercicio 14
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. 
 * El programa intentará adivinar el número que estás pensando - un número entre 0 
 * y 100 - teniendo paraello 5 oportunidades. En cada intento fallido, el programa 
 * debe preguntar si el número que estás pensando es mayor o menor que el que te 
 * acaba de decir.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio14 {

	public static void main(String[] args) 
    throws InterruptedException {

    System.out.println("EL PROGRAMA TIENE QUE AVERIGUAR 1 NUMERO ALEATORIO QUE TU TIENES PENSAO ENTRE 0 y 100 (TIENE 5 OPORTUNIDADES)");

    int oportunidades = 5;
    int intento = 0;
    int numeroPensado;
    int mayor = 100;
    int menor = 0;
    Thread.sleep(5550);
    do {
      numeroPensado = (int)(Math.random()*(mayor-menor)+menor);
      System.out.println(numeroPensado + " ¿Es es el numero que has pensado? Si/No");
      String respuesta= System.console().readLine().toLowerCase();
      
      if (respuesta.equals("si")){
        System.out.println("He acertado el numero secreto!!");
        break;
      } else {
        System.out.println("¿El numero que has pensado es mayor o menor?, Me quedan " + oportunidades + " oportunidades");
        String mayorMenor= System.console().readLine().toLowerCase();
        oportunidades--;
        intento++;
        
        if (mayorMenor.equals("mayor")){
          menor = numeroPensado+1;
        } else {
          mayor = numeroPensado-1;
        }
        
        if (intento == 5){
          System.out.println("Me has ganado no he conseguido averiguarlo :( ");
        }
      }
    } while (intento < 5);
  }
}
