package Ejercicio3;

public class Canario extends Ave {

  public Canario () {
    super();
  }

  public Canario (Sexo s) {
    super(s);
  }

  public void Canta(){
    System.out.println("pipipitritritri");
  }
  
  public void vuela(){
    System.out.println("Mira como aleteo");
  }
  
  public void picotea(){
    System.out.println("Estoy picoteando");
  }

}
