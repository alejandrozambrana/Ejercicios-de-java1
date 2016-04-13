package Ejercicio3;

public class Perro extends Mamifero {
  
  private String raza;

  public Perro (Sexo s, String r) {
    super(s);
    this.raza = r;
  }
  
  public Perro (Sexo s) {
    super(s);
    this.raza = "Dóberman";
  }
  
  public Perro (String r) {
    super(Sexo.HEMBRA);
    this.raza = r;
  }
  
  public Perro () {
    super(Sexo.HEMBRA);
    raza = "Dóberman";
  }
  
  public void ladra(){
    System.out.println("guauu guauu guauu");
  }
  
  public void aulla(){
    System.out.println("auuuuuuuuuuuuu!!");
  }
  
  public void caza(){
    System.out.println("Estoy cazando conejos");
  }

}
