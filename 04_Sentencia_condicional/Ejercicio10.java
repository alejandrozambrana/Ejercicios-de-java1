/**
 * Ejercicio 10 Escribe un programa que nos diga el horóscopo a partir del
 * día y el mes de nacimiento.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio10 {
  public static void main(String[] args) {
  
    String horoscopo = "";
        
    String mes;
    
    System.out.println("HOROSCOPO ");
        
    System.out.print("Introduce el dia en el que naciste: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el mes en que naciste (en letras) : ");
    mes = (System.console().readLine()).toLowerCase();
    
    switch(mes) {
      case "enero":
        if (dia < 20) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        }
        break;
      case "febrero":
        if (dia < 18) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        }
        break;  
      case "marzo":
        if (dia < 20) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        }
        break; 
      case "abril":
        if (dia < 20) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        }
        break; 
      case "mayo":
        if (dia < 21) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Geminis";
        }
        break; 
      case "junio":
        if (dia < 21) {
          horoscopo = "Geminis";
        } else {
          horoscopo = "Cancer";
        }
        break; 
      case "julio":
        if (dia < 23) {
          horoscopo = "Cancer";
        } else {
          horoscopo = "Leo";
        }
        break; 
      case "agosto":
        if (dia < 23) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        }
        break; 
      case "septiembre":
        if (dia < 23) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        }
        break; 
      case "octubre":
        if (dia < 23) {
          horoscopo = "Libra";
        } else {
          horoscopo = "Escorpio";
        }
        break; 
      case "noviembre":
        if (dia < 22) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        }
        break;
      case "diciembre":
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

