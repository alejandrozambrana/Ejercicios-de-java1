package Ejercicio3;

public class Ave extends Animal {

  public Ave () {
    super();
  }

  public Ave (Sexo s) {
    super(s);
  }

  public void volar(){
    System.out.println("Estoy volando");
  }
  
  public void nido(){
    System.out.println("Estoy haciendo un nido");
  }
  
  public void huevo(){
    if(this.getSexo() == Sexo.MACHO){
      System.out.println("Soy macho no pongo huevos");
    }else{
      System.out.println("Ya sale ya sale... ahi va un huevo! :)");
    }
  }

}
