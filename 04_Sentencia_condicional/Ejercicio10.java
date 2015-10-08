/**
 * Ejercicio 10 Escribe un programa que nos diga el horóscopo a partir del
 * día y el mes de nacimiento.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio10 {
  public static void main(String[] args) {
  
    String horoscopo = "";
    
    System.out.println("HOROSCOPO ");
        
    System.out.print("Introduce el dia en el que naciste: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el mes en que naciste: ");
    int mes = Integer.parseInt(System.console().readLine());
    
    switch(mes) {
      case 1:
        if (dia < 20) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        }
        break;
      case 2:
        if (dia < 18) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        }
        break;  
      case 3:
        if (dia < 20) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        }
        break; 
      case 4:
        if (dia < 20) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        }
        break; 
      case 5:
        if (dia < 21) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Geminis";
        }
        break; 
      case 6:
        if (dia < 21) {
          horoscopo = "Geminis";
        } else {
          horoscopo = "Cancer";
        }
        break; 
      case 7:
        if (dia < 23) {
          horoscopo = "Cancer";
        } else {
          horoscopo = "Leo";
        }
        break; 
      case 8:
        if (dia < 23) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        }
        break; 
      case 9:
        if (dia < 23) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        }
        break; 
      case 10:
        if (dia < 23) {
          horoscopo = "Libra";
        } else {
          horoscopo = "Escorpio";
        }
        break; 
      case 11:
        if (dia < 22) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        }
        break;
      case 12:
        if (dia < 22) {
          horoscopo = "Sagitario";
        } else {
          horoscopo = "Capricornio";
        }
        break; 
        default:
      }
      
      System.out.print("Su horóscopo es " + horoscopo);
      
      }
    }

