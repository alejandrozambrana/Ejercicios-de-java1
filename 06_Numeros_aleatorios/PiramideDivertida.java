/**
 * 5. Bucles
 * 
 * 19. Realiza un programa que pinte una pirámide por pantalla. La altura
 *     se debe pedir por teclado. El carácter con el que se pinta la pirámide
 *     también se debe pedir por teclado.
 * 
 * @author Luis José Sánchez
 */
public class PiramideDivertida {

	public static void main(String[] args) {
		
		System.out.print("Por favor, introduzca la altura de la pirámide: ");
		int alturaIntroducida = Integer.parseInt(System.console().readLine());

		String relleno = "";
		
		int altura = 1;
		int i = 0;
		int espacios = alturaIntroducida-1;
		
		while (altura <= alturaIntroducida) {
			
			// inserta espacios
			for (i = 1; i <= espacios; i++) {
				System.out.print(" ");
      }
			//genera el carácter de relleno
      switch((int)(Math.random()*5)){
        case 0:
          relleno = "*";
          break;
        
        case 1:
          relleno = "&";
          break;
        
        case 2:
          relleno = "X";
          break;
        
        case 3:
          relleno = "0";
          break;
        
        case 4:
          relleno = "7";
          break;
        default:
      
      }
      
			// pinta la línea
			for (i = 1; i < altura * 2; i++) {
			switch((int)(Math.random()*5)){
        case 0:
          relleno = "*";
          break;
        
        case 1:
          relleno = "&";
          break;
        
        case 2:
          relleno = "X";
          break;
        
        case 3:
          relleno = "0";
          break;
        
        case 4:
          relleno = "7";
          break;
        default:
      }
      	System.out.print(relleno);
			}
      
			System.out.println();
			
			altura++;
			espacios--;
		}
	}
}
