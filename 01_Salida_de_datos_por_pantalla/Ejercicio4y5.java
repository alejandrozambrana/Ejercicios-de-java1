/**
 * Ejercicio 4
 * Escribe un programa que muestre tu horario de clase. Puedes usar espacios o tabuladores para alinear el texto.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio4y5 { // Clase principal
  public static void main(String[] args) {
  
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println(morado + "\t\tLunes\tMartes\tMiercoles\tJueves\tViernes");
    System.out.println(morado + "8:15-9:15" + rojo + "\tFOL" + verde + "\tPROG" + naranja + "\tSIN" + verde +"\t\tPROG" + azul + "\tBBDD");
    System.out.println(morado + "09:15-10:15" + rojo + "\tFOL" + verde + "\tPROG" + naranja + "\tSIN" + verde +"\t\tPROG" + azul + "\tBBDD");
    System.out.println(morado + "10:15-11:15" + rojo + "\tFOL" + verde + "\tPROG" + naranja + "\tSIN" + verde +"\t\tPROG" + azul + "\tBBDD");
    System.out.println(morado + "11:15-11:45" + verde + "\tR" + rojo + "\tE" + verde +"\tC" + naranja + "\tR" + azul + "\tE" + morado + "\tO");
    System.out.println(morado + "11:45-12:40" + verde + "\tPROG" + azul + "\tBBDD" + naranja + "\tSIN" + rojo + "\t\tED" + verde +"\tPROG");
    System.out.println(morado + "12:40-13:35" + rojo + "\tED" + azul + "\tBBDD" + verde + "\tLM" + verde + "\t\tLM" + naranja + "\tSIN");
    System.out.println(morado + "13:35-14:30" + rojo + "\tED" + azul + "\tBBDD" + verde + "\tLM" + verde + "\t\tLM" + naranja + "\tSIN");
  }
}
