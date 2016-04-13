package Ejercicio3;

public class Lagarto extends Animal {

  public Lagarto () {
    super();
  }
  
  public Lagarto (Sexo s) {
    super(s);
  }
  
  public void tomaElSol(){
    System.out.println("Que agustito en el sol");
  }
  
  public void trepa(){
    System.out.println("Estoy trepando una pared");
  }
  
  public void escapa(){
    System.out.println("No me mates!");
  }

}
