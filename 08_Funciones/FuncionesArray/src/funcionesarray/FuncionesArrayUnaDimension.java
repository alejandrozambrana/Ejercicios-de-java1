package funcionesarray;
public class FuncionesArrayUnaDimension {
    /**
   * Muestra por pantalla todos los elementos de un array de números enteros
   * separados por un espacio.
   * 
   * @param x array unidimiensional de números enteros
   */
  public static void muestraArrayInt(int x[]) {
    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
  
  /**
  * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
  * cuyo intervalo (mínimo y máximo) se indica como parámetro.
  * 
  * 
  * @param n
  * @param minimo
  * @param maximo
  * @return  array de una dimension con numeros aleatorios 
  */
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int []x = new int[n];
    
     for(int i = 0; i < n; i++){
      x[i] = (int)(Math.random() * (maximo - minimo + 1)) + minimo;
     }
     return x;    
  }
   
  /**
  * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
  * 
  * 
   * @param array
  * @return  array de una dimension con numeros aleatorios saca el minimo
  */
  public static int minimoArrayInt(int[] array) {
    int numMin = Integer.MAX_VALUE;//coje el minimo valor
    
    for(int i : array ){
      if(i < numMin){
        numMin = i;
      }
    }
    return numMin;
  }
  
  /**
  * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
  * 
  * 
   * @param array
  * @return  array de una dimension con numeros aleatorios saca el maximo
  */
  public static int maximoArrayInt(int[]array) {
    int numMax = Integer.MIN_VALUE;//Coje el maximo valor     
    
    for(int i : array ){
      if(i > numMax){
        numMax = i;
      }
    }
    return numMax;
  }
  
  /**
  * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
  * 
  * 
   * @param array
  * @return  array de una dimension con numeros aleatorios saca la media
  */
  public static double mediaArrayInt(int[] array) {    
    int media = 0;
    
    for(int i : array ){
      media += i;
    }
    return (double) media / array.length;
  }
  
  /**
  * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
  * 
  * 
  * @param array
  * @return  array de una dimension con numeros aleatorios Dice si un número 
  * está o no dentro de un array
  */
  public static boolean estaEnArrayInt(int[] array, int comprueba) {    
    
    for(int i : array ){
      if(comprueba == i){
        return true;
      }
    }
    return false;
  }
  
  /**
  * 6. posicionEnArray: Busca un número en un array y devuelve la posición 
  * (el índice) en la que se encuentra.
  * 
  * 
  * @param array
  * @return  array de una dimension con numeros aleatorios Dice la posicion
  */
  public static int posicionEnArray(int[] array, int comprueba) {    
    
    for(int i = 0; i < array.length; i++){
      if(comprueba == array[i]){
        return i;
      }
    }
    return -1;
  }
  
  /**
  * 7. volteaArrayInt: Le da la vuelta a un array.
  * 
  * 
  * @param array
  * @return  array de una dimension con numeros aleatorios le da la vuelta
  */
  public static int[] volteaArrayInt(int[]array) {    
    
    int[] aux = new int [array.length];
    
    for(int i = 0 ; i < array.length; i++){
      aux[array.length - i - 1] = array[i];
    }
    return aux;
  }
  
 /**
  * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
  * 
  * 
  * @param array
  * @param posiciones
  * @return  array de una dimension con numeros aleatorios le da la vuelta
  */
  public static int[] rotaDerechaArrayInt(int[] array, int posiciones) {    
    
    int[] a = array.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (posiciones-- > 0) {
      aux = a[a.length - 1];
      for(i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }
      
    return a;
  }
  
/**
  * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
  * 
  * 
  * @param array
  * @param posiciones
  * @return  array de una dimension con numeros aleatorios le da la vuelta
  */
  public static int[] rotaIzquierdaArrayInt(int[] array, int posiciones) {    
    
    int[] a = array.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (posiciones-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
      
    return a;
  }
}
