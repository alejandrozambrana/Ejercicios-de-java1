package Ejercicio3;

public abstract class Animal {

  //para utilizar enumerado
  private Sexo sexo;
  
  public Animal () {
    this.sexo = Sexo.MACHO;
  }
  
  public Animal (Sexo s) {
    this.sexo = s;
  }
  
  public Sexo getSexo() {
    return this.sexo;
  }

  public String toString(){
    return "Sexo:" + this.sexo + "\n"
      + "Soy de la clase:" + this.getClass().getName() + "\n";
  }
  public void duerme() {
    System.out.println("Zzzzzzz");
  }
  
  public void come(String comida) {
    System.out.println("Estoy comiendo " + comida);
  }
}
