
import java.util.Scanner;

public class otra {
	public static void main(String[] args) {
		//objetos necessarios
		coisa coisas = new coisa();
		Scanner in = new Scanner(System.in);
		//variaveis do sistema.
		boolean Terminado = false;
		String j= "J";
		String entrada;
		
		String mapa[][] = {{"0","0","0"},
						   {"0","0","0"},
					   	   {"0","0","0"}};
		  //c //l
		mapa[1][0] = j;
		
	while(!Terminado) {
		for (int c1 = 0; c1<3; c1++) {
			for(int c2 = 0; c2<3; c2++) 
				System.out.print(mapa[c1][c2]+" ");
				System.out.println();
			  						
				}
		
				System.out.println("teste!");
				entrada = in.next();
				int desenharc;
				int desenharl;
				int jposc = 1;
				int jposl = 0;
				
				switch (entrada) {
	
				case "w":
								
					int cont = jposc--;
					int cont2 = jposl;
			         										
					mapa[0][0] = j;	
					
					mapa[cont][cont2] = j;	
					
					  System.out.println(cont + "" + jposc);
				
					break;
					
				case "s":
					
					cont = jposc++;
					cont2 = jposl;
							
					mapa[0][0] = j;	
					
					mapa[cont][cont2] = j;						
						
				    
						
					break;
					
				case "a":
					
					break;
					
				case "d":
					
					break;
					
				case "showjposc":
				
				
				
				break;
					
				}
				
			}
		}
	}

	