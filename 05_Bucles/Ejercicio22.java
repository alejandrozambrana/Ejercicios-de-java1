/**
 * Ejercicio 22
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio22 {
  public static void main(String[] args) {
     
    System.out.println("MUESTRA POR PANTALLA LOS NUMEROS PRIMOS DEL 2 AL 100");
      
    boolean primo = true;
    
    for (int i = 2; i <= 100 ;i++){
      
      // comprueba si i es primo
      primo = true;
      for (int n = 2; n < i; n++){
        if (i%n == 0) primo = false;
      }
      //muestra por pantalla los numeros primos
      if (primo){
        System.out.print(i + ", ");
        
      }
    } 
  }
}


