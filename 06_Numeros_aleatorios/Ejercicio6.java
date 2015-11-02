/**
 * 
 * Ejercicio 6
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe 
 * adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es 
 * menor o mayor que el número secreto.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio6 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA TIENES QUE AVERIGUAR 1 NUMERO ALEATORIO ENTRE 0 y 100 (TIENES 5 OPORTUNIDADES)");

    int oportunidades = 5;
    int intento = 0;
    
    int numeroSecreto = (int)(Math.random()*101);
    do {
      System.out.print("Introduce un numero:");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if(numeroIntroducido == numeroSecreto){
        System.out.println("Enhorabuena, Ha acertado el numero secreto");
        break;
      } else {
        oportunidades--;
        System.out.println("Lo siento el numero Secreto no es correcto, Tiene " + oportunidades + " oportunidades");
      
        if (numeroIntroducido > 100){
          System.out.println("El numero introducido es mayor que 100");
        }
        if (numeroIntroducido < 0){
          System.out.println("El numero introducido es menor que 0");
        }
    
        intento++;
        
        if (intento == 5){
          System.out.println("Ha superado el limite de intentos. El numero era: " + numeroSecreto);
        }
      }
    } while (intento < 5);
  }
}
