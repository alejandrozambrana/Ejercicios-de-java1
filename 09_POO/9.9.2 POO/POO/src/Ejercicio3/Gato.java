package Ejercicio3;

public class Gato extends Mamifero {
  
  private String raza;

  public Gato (Sexo s, String r) {
    super(s);
    this.raza = r;
  }
  
  public Gato (Sexo s) {
    super(s);
    this.raza = "persa";
  }
  
  public Gato (String r) {
    super(Sexo.HEMBRA);
    this.raza = r;
  }
  
  public Gato () {
    super(Sexo.HEMBRA);
    raza = "persa";
  }
  
  public void maulla(){
    System.out.println("Miauuuuuu");
  }
  
  public void araña(){
    System.out.println("Te voy a arañar");
  }
  
  public void lame(){
    System.out.println("Me estoy lamiendo");
  }

}
