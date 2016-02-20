/**
 * Funciones matematicas
 * 
 * @author Alejandro Zambrana Naranjo
 * 
 */
package Funciones;


public class Calculos {
  
  
  /**
   * esCapicua: Devuelve verdadero si el nÃºmero que se pasa como parÃ¡metro 
   * es capicua y falso en caso contrario.
   * 
   * @param x un nÃºmero entero positivo
   * @return  <code>true</code> si el nÃºmero es capicua
   * @return  <code>false</code> en caso contrario
   */
  public static boolean esCapicua(int n) {
    
    if(n == voltea(n)){
      return true;
    } else {
      return false;
    }
  }
    /**
   * 2. esPrimo: Devuelve verdadero si el nÃºmero que se pasa como parÃ¡metro 
   * es primo y falso en caso contrario.
   * 
   * @param n un nÃºmero entero positivo
   * @return  <code>true</code> si el nÃºmero es Primo
   * @return  <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int n) {
    for (int x = 2; x < n; x++) {
        if((n % x) == 0){
         return false;
        }
    }
    return true;
  }
  
    /**
   * 3. siguientePrimo: Devuelve el menor primo que es mayor al nÃºmero que se 
   * pasa como parÃ¡metro.
   * 
   * @param x un nÃºmero entero
   * @return  el menor primo que es mayor al nÃºmero que se pasa como parÃ¡metro
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
    } else {
        System.out.println("El exponente introducido es negatico");
      }
    return resultado;
  }
  
  /**
   * 
   * 5. digitos: Cuenta el nÃºmero de dÃ­gitos de un nÃºmero entero.
   * 
   * @param X un nÃºmero entero
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
   * 6. voltea: Le da la vuelta a un nÃºmero.
   * 
   * @param X un nÃºmero entero
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
   * 7. digitoN: Devuelve el dÃ­gito que estÃ¡ en la posiciÃ³n n de un nÃºmero 
   * entero. Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param X un nÃºmero entero
   * @param X un nÃºmero entero con la posicion
   * @return dice que cifra hay en la posicion elegida
   */
  public static int digitoN(long n, int p) {
    n = voltea(n);
    
    // comprueba la posiciÃ³n
    while (p-- > 0) {
      n = n / 10;
    }
    
    return (int)n % 10;
  }
  
  /**
   * 
   * 8. posicionDeDigito: Da la posiciÃ³n de la primera ocurrencia de un dÃ­gito 
   * dentro de un nÃºmero entero. Si no se encuentra, devuelve -1.
   * 
   * @param X un nÃºmero entero
   * @param X un nÃºmero entero con la posicion
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
    
    // comprueba la posiciÃ³n
    do {
      if ((n % 10) == p){
        break;
      }
      n = n / 10;
      posicion++;
    } while (n > 0);
    return posicion++;
  }

  /**
   * 
   * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
   * 
   * @param num un nÃºmero entero
   * @return quita una cifra al numero
   */ 
  public static int quitarPorDetras(int num) {
    num = num/10;         //le quitamos el último dígito
    
    return num;
  }

  /**
   * Le quita a un nÃºmero <code>n</code> dÃ­gitos por detrÃ¡s (por la derecha). 
   *
   * @param x nÃºmero entero
   * @param n nÃºmero de dÃ­gitos que se le van a quitar
   * @return  nÃºmero inicial <code>x</code> con <code>n</code> dÃ­gitos menos
   *          quitados de la derecha
   */
  public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
  }
  
 /**
   * 
   * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
   * 
   * @param num un nÃºmero entero
   * @return quita una cifra al numero
   */ 
  public static int quitaPorDelante(int num) {
      int alreves = (int)voltea(num); //pasa el numero volteado a la varia alreves
      
      alreves = alreves/10;         //le quitamos el último dígito
    
      int porDelante = (int)voltea(alreves);  //vuelve a voltear el numero
      
    return porDelante;
  }
  
  /**
   * Le quita a un nÃºmero <code>n</code> dÃ­gitos por delante (por la izquierda).                                                 *
   * @param x nÃºmero entero
   * @param n nÃºmero de dÃ­gitos que se le van a quitar
   * @return  nÃºmero inicial <code>x</code> con <code>n</code> dÃ­gitos menos
   *          quitados de la izquierda
   */
  public static long quitarPorDelante(long x, int n) {
    x = pegaPorDetras((int)x, 1); // "cierra" el nÃºmero por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }
  
   /**
   * 
   * 11. pegaPorDetras: Añade un dígito a un número por detrás.
   * 
   * @param num un nÃºmero entero
   * @param añadido un numero añadido
   * @return pega numeros
   */ 
  public static int pegaPorDetras(int num, int añadido) {
    num = (num * 10) + añadido;
    return num;
  }
  
     /**
   * 
   * 12. pegaPorDelante: Añade un dígito a un número por delante.
   * 
   * @param num un nÃºmero entero
   * @param añadido un numero añadido
   * @return pega numeros
   */ 
  public static int pegaPorDelante(int num, int añadido) {
    num = (int) voltea(num);
    num = (num * 10) + añadido;
    num = (int) voltea(num);
    return num;
  }
  /**
   * 
   * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final 
   * dentro de un número y devuelve el trozo correspondiente.
   * 
   * @param num un nÃºmero entero
   * @param añadido un numero añadido
   * @return pega numeros
   */ 
  public static int trozoDeNumero(int num, int inicio, int fin) {
    fin = digitos(num) - fin;
    for(int i = 0; i < inicio-1; i++){
      num = quitaPorDelante(num);
    }
    for(int i = 0; i < fin; i++){
      num = quitarPorDetras(num);
    }
    return num;
  }
  
  /**
   * 
   * 14. juntaNumeros: Pega dos números para formar uno.
   * 
   * @param num un nÃºmero entero
   * @param añadido un numero añadido
   * @return junta dos numeros
   */ 
  public static int juntaNumeros(int num, int numero2) {
    int contador = 1;
    
    for(int i = 0; i < digitos(numero2);i++ ){
      contador = (contador * 10); 
    }
    num = num * contador;
    num = num + numero2;
    
    return num;
  }
  
  /**
   * 
   * Ejercicio 15 Muestra los números primos que hay entre 1 y 1000.
   * 
   * @param num un nÃºmero entero
   * @param numero2 un nÃºmero entero
   * @return Muestra numeros primos
   */ 
   public static void primos1Al1000() {
    for(int i = 1; i <= 1000; i++){
      if( esPrimo(i)){
        System.out.print(i + " ");
      }
    }
  }
}
