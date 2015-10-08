/**
 * Ejercicio 1
 * Escribe un programa que pida por teclado un día de la semana y que diga qué 
 * asignatura toca a primera hora ese día.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    
    System.out.println("Calendario");
    
    System.out.print("Introduzca un dia de la semana : ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaDelsemana;
    String horario = "";
    
    switch (dia) {
      case 1:
        diaDelsemana = "Lunes";
        horario = "Horario: FOL, FOL, FOL, RECREO, PROG, ED, ED";
        break;
      case 2:
        diaDelsemana = "Martes";
        horario = "Horario: PROG, PROG, PROG, RECREO, BBDD, BBDD, BBDD";
        break;
      case 3:
        diaDelsemana = "Miercoles";
        horario = "Horario: SIN, SIN, SIN, RECREO, SIN, LM, LM";
        break;
      case 4:
        diaDelsemana = "Jueves";
        horario = "Horario: PROG, PROG, PROG, RECREO, ED, LM, LM";
        break;
      case 5:
        diaDelsemana = "Viernes";
        horario = "Horario: BBDD, BBDD,BBDD, RECREO, PROG, SIN, SIN";
        break;
      default:
        diaDelsemana = "no existe ese dia de la semana";    
    }
    System.out.println("El dia es: " + diaDelsemana);
    System.out.println(horario);
  }
}
