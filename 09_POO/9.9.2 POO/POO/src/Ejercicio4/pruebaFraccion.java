
package Ejercicio4;

import java.util.Scanner;

public class pruebaFraccion {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numerador: ");
    int num = s.nextInt();
    System.out.print("Introduce un denominador: ");
    int deno= s.nextInt();
    
    Fraccion f1 = new Fraccion(num,deno);
    System.out.println(f1 + " = " + f1.invierte());
    System.out.println(f1 + " x 3 = "+ f1.multiplica(3));
    
    Fraccion f2 = new Fraccion(3, 5);
    System.out.println(f1 + " x " + f2 + " = " + f1.multiplica(f2));
    System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2));
        
    Fraccion f3 = new Fraccion(910, -350);
    System.out.println(f3 + " = " + f3.simplifica());
  }
}


