
package Ejercicio3;

public class ProbarAnimal {

  public static void main(String[] args) {
    
    System.out.println("AVE");
    Ave aguila = new Ave(Sexo.HEMBRA);
    aguila.volar();
    aguila.huevo();
    aguila.nido();
    System.out.println();
    
    System.out.println("CANARIO");
    Canario canario = new Canario(Sexo.MACHO);
    canario.Canta();
    canario.picotea();
    canario.vuela();
    canario.huevo();
    System.out.println();
    
    System.out.println("GATO");
    Gato garfiel = new Gato(Sexo.MACHO, "Red Mackerel Tabby Britanico");
    garfiel.araña();
    garfiel.caza();
    garfiel.come();
    garfiel.maulla();
    garfiel.lame();
    System.out.println(garfiel);
    
    
    System.out.println("LAGARTO");
    Lagarto lagarto = new Lagarto(Sexo.MACHO);
    lagarto.tomaElSol();
    lagarto.trepa();
    lagarto.escapa();
    System.out.println();
    
    System.out.println("PERRO");
    Perro Lunares = new Perro(Sexo.MACHO, "pointer");
    Lunares.ladra();
    Lunares.aulla();
    Lunares.caza();
    Lunares.DanDeMamar();
    Lunares.come();
    System.out.println();
    
    System.out.println("PERRA");
    Perro canela = new Perro(Sexo.HEMBRA, "podenco");
    canela.ladra();
    canela.aulla();
    canela.caza();
    canela.DanDeMamar();
    canela.come();
    System.out.println();
    
    System.out.println("Pinguino");
    Pinguino Torpon = new Pinguino(Sexo.MACHO);
    Torpon.Desliza();
    Torpon.anda();
    Torpon.huevo();
    Torpon.bano();
    System.out.println(Torpon);
    
  }
  
}
