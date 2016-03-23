package Ejercicio3;

public class Pinguino extends Ave {

  public Pinguino () {
    super();
  }

  public Pinguino (Sexo s) {
    super(s);
  }

  public void Desliza(){
    System.out.println("Me deslizo por el hielo");
  }
  
  public void bano(){
    System.out.println("Me estoy bañando, que agua mas fresquita!");
  }
  
  public void anda(){
    System.out.println("Estoy andando con cuidado me puedo caer");
  }

}
