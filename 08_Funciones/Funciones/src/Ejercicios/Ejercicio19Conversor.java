package Ejercicios;

/**
 * 
 * Ejercicio 19
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 * hexadecimal y octal.
 * 
 * @author Alejandro Zambrana Naranjo
 */
import Funciones.Calculos;
 
import java.util.Scanner;
 
public class Ejercicio19Conversor {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    long numeroIntroducido = 1;
    String resultado = "";
    
    System.out.println("CONVERSOR");
    System.out.println(" 1) Binario -> Octal");
    System.out.println(" 2) Binario -> Decimal");
    System.out.println(" 3) Binario -> Hexadecimal");
    System.out.println(" 4) Octal -> Binario");
    System.out.println(" 5) Octal -> Decimal");
    System.out.println(" 6) Octal -> Hexadecimal");
    System.out.println(" 7) Decimal -> Binario");
    System.out.println(" 8) Decimal -> Octal");
    System.out.println(" 9) Decimal -> Hexadecimal");
    System.out.println("10) Hexadecimal -> Binario");
    System.out.println("11) Hexadecimal -> Octal");
    System.out.println("12) Hexadecimal -> Decimal");
    System.out.print("Seleciona una opcion (1-12): ");
    int opcion = Integer.parseInt(s.nextLine());
    
    System.out.print("introduzca un numero a convertir: ");
    String numeroIntroducidoString = s.nextLine();
    
    if (opcion < 10) {
      numeroIntroducido = Long.parseLong(numeroIntroducidoString);
    }
    
    switch (opcion) {
      case 1:
        resultado = Long.toString(binarioAOctal(numeroIntroducido));
        break;
      case 2:
        resultado = Long.toString(binarioDecimal(numeroIntroducido));
        break;
      case 3:
        resultado = binarioAHexadecimal(numeroIntroducido);
        break;
      case 4:
        resultado = Long.toString(octalABinario(numeroIntroducido));
        break;
      case  5:
        resultado = Long.toString(binarioDecimal(octalABinario(numeroIntroducido)));
        break;
      case  6:
        resultado = binarioAHexadecimal(octalABinario(numeroIntroducido));
        break;
      case  7:
        resultado = Long.toString(decimalBinario(numeroIntroducido));
        break;
      case  8:
        resultado = Long.toString(binarioAOctal(decimalABinario(numeroIntroducido)));
        break;
      case  9:
        resultado = binarioAHexadecimal(decimalABinario(numeroIntroducido));
        break;
      case 10:
        resultado = Long.toString(hexadecimalABinario(numeroIntroducidoString));
        break;
      case 11:
        resultado = Long.toString(binarioAOctal(hexadecimalABinario(numeroIntroducidoString)));
        break;
      case 12:
        resultado = Long.toString(binarioDecimal(hexadecimalABinario(numeroIntroducidoString)));
        break;
    }
    System.out.println(resultado);
  }
  
   /**
   * 
   * Pasa de decimal a binario
   * 
   * @param num un nÃºmero entero
   * @return Pasa de decimal a binario
   */ 
  public static long decimalBinario(long num) {
    
    if (num == 0) {
      return 0;
    }
    
    int binario = 1;
    
    do{
      binario = Funciones.Calculos.pegaPorDetras(binario, (int)num % 2);
      num = num / 2;
     }while (num > 0);
    long binarioFinal = 0;
    
    binarioFinal = Funciones.Calculos.voltea((long)binario);
    binarioFinal = Funciones.Calculos.quitaPorDetras((int)binarioFinal, 1);
    return binarioFinal;
  }
  
  /**
   * 
   * Pasa de binario a decimal
   * 
   * @param num un nÃºmero entero
   * @return Pasa de binario a decimal
   */ 
  public static long binarioDecimal(long num) {
    int aux = 0;
    
    int longitud = (Funciones.Calculos.digitos((int)num));
    
    for(int i = 0; i < longitud; i++) {
      aux += Funciones.Calculos.digitoN(num, longitud - i - 1) * Funciones.Calculos.potencia(2,i);
    }
      
    return aux;
  }
  
   /**
   * 
   * Pasa de binario a decimal
   * 
   * @param num un nÃºmero entero
   * @return Pasa de binario a decimal
   */ 
  public static long binarioAOctal(long num) {
    long octal = 0;
    
    while (num > 0) {
      octal = octal * 10 + (binarioDecimal(num % 1000));
      num = num / 1000;
    }; 
  
    octal = Funciones.Calculos.pegaPorDetras((int)octal, 1);
    octal = Funciones.Calculos.voltea(octal);
    octal = Funciones.Calculos.quitaPorDetras(octal, 1);
    octal = Funciones.Calculos.quitarPorDelante(octal, 1);
    
    return octal;
  }
  
  /**
   * Pasa un nÃºmero binario (en base 2) a hexadecimal (base 16).
   * 
   * @param binario nÃºmero entero en binario
   * @return        nÃºmero inicial pasado a hexadecimal
   */
   public static String binarioAHexadecimal(long binario) {
    String hexadecimal = "";
    String digitosHexa = "0123456789ABCDEF";
  
    while (binario > 0) {
      hexadecimal = digitosHexa.charAt((int)binarioDecimal(binario % 10000)) + hexadecimal;
      binario = binario / 10000;
    };
      
    return hexadecimal;
  }
  
  /**
   * Pasa un nÃºmero octal (en base 8) a binario (base 2).
   * 
   * @param octal nÃºmero entero en octal
   * @return      nÃºmero inicial pasado a binario
   */
  public static long octalABinario(long octal) {
    long binario = 0;
  
    for (int i = 0; i < Funciones.Calculos.digitos((int)octal); i++) {
      binario = binario * 1000 + decimalABinario(Funciones.Calculos.digitoN(octal, i));
    }
    
    return binario;
  }
  
  /**
   * Pasa un nÃºmero decimal (en base 10) a binario (base 2).
   * 
   * @param octal nÃºmero entero en decimal
   * @return      nÃºmero inicial pasado a binario
   */
  public static long decimalABinario(long decimal) {
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = Funciones.Calculos.pegaPorDetras((int)binario, (int)decimal % 2);
      decimal = decimal / 2;
    }
    binario = Funciones.Calculos.pegaPorDetras((int)binario, 1);
    binario = Funciones.Calculos.voltea(binario);
    binario = Funciones.Calculos.quitaPorDetras(binario, 1);
    
    return binario;
  }

  /**
   * Pasa un nÃºmero hexadecimal (en base 10) a binario (base 2).
   * 
   * @param hexadecimal nÃºmero entero en hexadecimal
   * @return            nÃºmero inicial pasado a binario
   */
  public static long hexadecimalABinario(String hexadecimal) {
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;
  
    for (int i = 0; i < hexadecimal.length(); i++) {
      binario = binario * 10000 + decimalABinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
    }

    return binario;
  }
}