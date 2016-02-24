
package funcionesarraybi;
public class FuncionesArrayBi {
  
  /**
   * Muestra por pantalla el contenido de un array bidimensional de nÃºmeros
   * enteros.
   * <p>
   * Los nÃºmeros se muestran perfectamente tabulados en filas y columnas.
   *
   * @param x array bidimiensional de nÃºmeros enteros
   */
  public static void muestraArrayBiInt(int x[][]) {

    for(int filas = 0; filas < x.length; filas++) {
      for(int columnas = 0; columnas < x[0].length; columnas++) {
        System.out.printf("%4d", x[filas][columnas]);
      }
      System.out.println();
    }
  }
  
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
  * 1. generaArrayBiInt: Genera un array de tamaño n x m con números 
  * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
  * 
  * 
   * @param x
  * @return  array de una dimension con numeros aleatorios 
   */
  public static int[][] generaArrayBiInt(int columnas, int filas, int inicio, int fin) {
   
    int[][] x = new int [filas][columnas];
    
    for(filas = 0; filas < x.length; filas++) {
      for(columnas = 0; columnas < x[0].length; columnas++) {
        x[filas][columnas] = (int)(Math.random()* (fin - inicio + 1) ) + inicio;
      }
    }
    return x;
  }
  
  /**
  * 2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
  * 
  * 
  * @param x
  * @return  array de una dimension con numeros aleatorios 
  */
  public static int[] filaDeArrayBiInt(int[][] x, int extraer) {
   
    int[] unaDimen = new int [x[0].length];
    
    for(int filas = 0; filas < x.length; filas++) {
      for(int columnas = 0; columnas < x[0].length; columnas++) {
        if (filas == extraer){
          unaDimen[columnas] = x[filas][columnas];
        }
      }
    }
    return unaDimen;
  }
  
  /**
  * 3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como parámetro.
  * 
  * 
  * @param x
  * @return  array de una dimension con numeros aleatorios 
  */
  public static int[] columnaDeArrayBiInt(int[][] x, int extraer) {
   
    int[] unaDimen = new int [x[0].length];
    
    for(int filas = 0; filas < x.length; filas++) {
      for(int columnas = 0; columnas < x[0].length; columnas++) {
        if (columnas == extraer){
          unaDimen[filas] = x[filas][columnas];
        }
      }
    }
    return unaDimen;
  }
  
 /**
  * 4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array 
  * con dos elementos) de la primera ocurrencia de un número dentro de un 
  * array bidimensional. Si el número no se encuentra en el array, la función 
  * devuelve el array {-1, -1}.
  * 
  * 
  * @param x
  * @return  array de una dimension con numeros aleatorios 
  */
  public static int[] coordenadasEnArrayBiInt(int[][] x, int num) {
   
     int[]unaDimen = new int [2];
    
    for(int filas = 0; filas < x.length; filas++) {
      for(int columnas = 0; columnas < x[0].length; columnas++) {
        if (x[filas][columnas] == num){
          unaDimen[0] = filas;
          unaDimen[1] = columnas;
          return unaDimen;
        }
      }
    }
    int[] coordenadas = {-1, -1};      
    return coordenadas;
  }
  
 /**
  * saca el minimo de un array bidimencional
  * 
  * 
  * @param x
  * @return  saca el minimo de un array bidimencional
  */
  public static int minimoArrayBi(int[][] x) {
   
    int minimo = Integer.MAX_VALUE;
    
    for(int filas = 0; filas < x.length; filas++) {
      for(int columnas = 0; columnas < x[0].length; columnas++) {
        if(minimo > x[filas][columnas]){
          minimo = x[filas][columnas];
        }
      }
    }
        
    return minimo ;
  }
  
   /**
  * saca el maximo de un array bidimencional
  * 
  * 
  * @param x
  * @return  saca el maximo de un array bidimencional
  */
  public static int maximoArrayBi(int[][] x) {
   
    int maximo = Integer.MIN_VALUE;
    
    for(int filas = 0; filas < x.length; filas++) {
      for(int columnas = 0; columnas < x[0].length; columnas++) {
        if(maximo < x[filas][columnas]){
          maximo = x[filas][columnas];
        }
      }
    }
        
    return maximo ;
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
  * 5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, 
  * mínimo en su fila y máximo en su columna.
  * 
  * 
  * @param x
  * @return  array de una dimension con numeros aleatorios 
  */
  public static boolean esPuntoDeSilla(int[][] x) {
    
    for(int filas = 0; filas < x.length; filas++) {
      for(int columnas = 0; columnas < x[0].length; columnas++) {
        return (minimoArrayInt(filaDeArrayBiInt(x, filas))  == x[filas][columnas] &&
        maximoArrayInt(columnaDeArrayBiInt(x, columnas)) == x[filas][columnas]);
  
      }
    }
    return false;
  }
  
 /**
  * 6. diagonal: Devuelve un array que contiene una de las diagonales del
  * array bidimensional que se pasa como parámetro. Se pasan como
  * parámetros fila, columna y dirección. La fila y la columna determinan
  * el número que marcará las dos posibles diagonales dentro del array. La
  * dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
  * cadena “nose” indica que se elige la diagonal que va del noroeste hacia
  * el sureste, mientras que la cadena “neso” indica que se elige la diagonal
  * que va del noreste hacia el suroeste.
  * 
  * 
  * @param x
   * @param filaIntro
   * @param columnaIntro
   * @param direccion
  * @return  array de una dimension con numeros aleatorios 
  */
  public static int[] diagonal(int[][] x, int filaIntro, int columnaIntro, String direccion) {
    int[] diagonal = new int [x.length];
    int fil = filaIntro;
    int col = x[0].length - (filaIntro + 1) ;
    int i = 0;
    
    if(direccion.equals("nose")){
      for(int filas = filaIntro; filas <= columnaIntro; filas++ ){
        for(int columnas = filaIntro; columnas <= col; columnas++ ){
          if(filas == fil && columnas == col){ //pinta la diagonal
             diagonal[i++] = x[filas][columnas];
          }
        }
      fil++;
      col--;
      }
      return diagonal;
    } else{
     int[] neso = new int [x.length];
     
      for(int filas = filaIntro; filas <= columnaIntro; filas++ ){
        for(int columnas = filaIntro; columnas <= columnaIntro; columnas++ ){
          if(filas == columnas){ //pinta la diagonal
            neso[fil] = x[filas][columnas];
          }
        }
       fil++;
      }
      return neso;
    }
  }
}
