/**
 * Ejercicio 3
 * Escribe un programa en que dado un número del 1 a 7 escriba el 
 * correspondiente nombre del día de la semana.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.println("DIAS DE LA SEMANA");
    System.out.print("Introduzca un numero del 1 al 7: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaDelsemana;
    
    switch (dia) {
      case 1:
        diaDelsemana = "Lunes";
        break;
      case 2:
        diaDelsemana = "Martes";
        break;
      case 3:
        diaDelsemana = "Miercoles";
        break;
      case 4:
        diaDelsemana = "Jueves";
        break;
      case 5:
        diaDelsemana = "Viernes";
        break;
        case 6:
        diaDelsemana = "Sabado";
        break;
        case 7:
        diaDelsemana = "Domingo";
        break;
      default:
        diaDelsemana = "no existe ese dia de la semana";    
    }
    System.out.println("El dia numero " + dia + " es el "+ diaDelsemana);
    
 }
}
