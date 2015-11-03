/**
 * 
 * Ejercicio 2
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja 
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes 
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son 
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 
 * 1). Para convertir un número en una cadena de caracteres podemos usar 
 * String.valueOf(n).
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio2 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA UNA CARTA DE LA BARAJA FRANCESA");

    String palos = "";
    String cartas = "";
    
    int tipopalos = (int)(Math.random()*4) + 1;
    
      switch (tipopalos) {
        case 1:
          palos = "picas";
          break;
        case 2:
          palos = "corazones";
          break;
        case 3:
          palos = "diamantes";
          break;
        case 4:
          palos = "treboles";
          break;
        default:
      }
    int numerocarta = (int)(Math.random()*13 ) + 1;
    
      switch (numerocarta) {
        case 1:
          cartas = "As";
          break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
          cartas = String.valueOf(numerocarta); //Para convertir un número en una cadena de caracteres
          break;
        case 11:
          cartas = "J";
          break;
        case 12:
          cartas = "Q";
          break;
        case 13:
          cartas = "K";
          break;
        default:
      }
    
    System.out.println("Su carta es: " + cartas + " de " + palos);
  }
}
