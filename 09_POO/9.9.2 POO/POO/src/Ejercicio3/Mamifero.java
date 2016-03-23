package Ejercicio3;

public abstract class Mamifero extends Animal {

  public Mamifero () {
    super();
  }

  public Mamifero (Sexo s) {
    super(s);
  }

  public void DanDeMamar(){
    if(this.getSexo() == Sexo.MACHO){
      System.out.println("No puedo dar de mamar soy macho");
    } else{
      System.out.println("Toma leche. blu blu blu");
    }
  }
  
  public void come(){
    System.out.println("ñan ñan ñan");
  }
  
  public void caza(){
    System.out.println("Estoy acechando a mi presa");
  }
  

}
