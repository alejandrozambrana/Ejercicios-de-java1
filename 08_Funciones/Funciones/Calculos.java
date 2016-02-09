/**
 * Funciones matematicas
 * 
 * @author Alejandro Zambrana Naranjo
 * 
 */
package Funciones;


public class Calculos {
  
  
  /**
   * esCapicua: Devuelve verdadero si el número que se pasa como parámetro 
   * es capicúa y falso en caso contrario.
   * 
   * @param x un número entero positivo
   * @return  <code>true</code> si el número es capicua
   * @return  <code>false</code> en caso contrario
   */
  public static boolean esCapicua(int n) {
    
    
       // número de una cifra
    if (n < 10) {
      return true;
    } 
    
    // número de dos cifras
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        return true;
      } else {
        return false;
      }
    }

    // número de tres cifras
    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        return true;
      } else {
        return false;
      }
    }

    // número de cuatro cifras
    if ((n >= 1000) && (n < 10000)) {
      if (((n /1000) == (n % 10)) && (((n / 100) % 10) == ((n / 10) % 10))) {
        return true;
      } else {
        return false;
      }
    }
    
    // número de cinco cifras
    if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }
    /**
   * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro 
   * es primo y falso en caso contrario.
   * 
   * @param x un número entero positivo
   * @return  <code>true</code> si el número es Primo
   * @return  <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int n) {
    for (int x = 2; x < n; x++) {
        if((n % x) == 0){
         return false;
        }
      return true;
    }
    return true;
  }
  
    /**
   * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se 
   * pasa como parámetro.
   * 
   * @param x un número entero
   * @return  el menor primo que es mayor al número que se pasa como parámetro
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {};

    return x;
  }
  
  /**
   * 
   * 4. potencia: Dada una base y un exponente devuelve la potencia.
   * 
   * @param base      base de la potencia
   * @param exponente exponente de la potencia
   * @return Calcula una potencia
   */
  public static int potencia(int base, int exponente) {
    int resultado = 1;
    
    if (exponente >= 0) {
      for (int n = 1; n <= exponente; n++){
        
        resultado = resultado * base;
      }
      System.out.println(base + "^" + exponente + " = " + resultado);
    } else {
        System.out.println("El exponente introducido es negatico");
      }
    return resultado;
  }
  
  /**
   * 
   * 5. digitos: Cuenta el número de dígitos de un número entero.
   * 
   * @param X un número entero
   * @return Cuenta cuantos digitos tiene el numero
   */
  public static int digitos(int n) {
   
   int digitos = 1;
   
    while (n > 9) {
      n = n/10;
      digitos++;
      }
    return digitos;
  }
  
  /**
   * 
   * 6. voltea: Le da la vuelta a un número.
   * 
   * @param X un número entero
   * @return Voltea un numero
   */
  public static long voltea(long x) {
    long reves = 0;
    
    do {
      reves = (reves * 10) + (x % 10);
      x = x / 10;
    } while (x > 0);
    
    return reves;
  }
  
  /**
   * 
   * 7. digitoN: Devuelve el dígito que está en la posición n de un número 
   * entero. Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param X un número entero
   * @param X un número entero con la posicion
   * @return dice que cifra hay en la posicion elegida
   */
  public static int digitoN(long n, int p) {
    n = voltea(n);
    
    // comprueba la posición
    while (p-- > 0) {
      n = n / 10;
    }
    
    return (int)n % 10;
  }
  /**
   * 
   * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito 
   * dentro de un número entero. Si no se encuentra, devuelve -1.
   * 
   * @param X un número entero
   * @param X un número entero con la posicion
   * @return dice en que posicion esta la cifra elegida
   */
  public static int posicionDeDigito(long n, int p) {
    /* ////////SOLUCION CON -1//////////////////////////////////
    int i;

    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }*/
    
    int posicion = 1;
    
    n = voltea(n);
    
    // comprueba la posición
    do {
      if ((n % 10) == p){
        break;
      }
      n = n / 10;
      posicion++;
    } while (n > 0);
    return posicion++;
  }
}
