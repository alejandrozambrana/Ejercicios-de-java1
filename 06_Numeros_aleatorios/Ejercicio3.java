/**
 * 
 * Ejercicio 3
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la 
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio3 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA UNA CARTA DE LA BARAJA ESPAÑOLA");

    String palos = "";
    String cartas = "";
    
    int tipopalos = (int)(Math.random()*4) + 1;
    
      switch (tipopalos) {
        case 1:
          palos = "Oro";
          break;
        case 2:
          palos = "copas";
          break;
        case 3:
          palos = "basto";
          break;
        case 4:
          palos = "espada";
          break;
        default:
      }
    int numerocarta = (int)(Math.random()*10 ) + 1;
    
      switch (numerocarta) {
        case 1:
          cartas = "As";
          break;
        case 8:
          cartas = "Sota";
          break;
        case 9:
          cartas = "Caballo";
          break;
        case 10:
          cartas = "Rey";
          break;
        default:
          cartas = String.valueOf(numerocarta);
      }
    
    System.out.println("Su carta es: " + cartas + " de " + palos);
  }
}
