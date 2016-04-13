package Ejercicio2;

public class Bicicleta extends vehiculo {
 
  private String color; 
  
  private int platos = 1;
  
  public Bicicleta(String c, int p) {
    super();//lama al contructor de la superclase
    this.color = c;
    this.platos = p;
  }

  public void hazCaballito() {
    System.out.println("Estoy haciendo el caballito");
    System.out.println ("--------------------------------");
  }
}
