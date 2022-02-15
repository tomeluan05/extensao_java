package Lanches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaMain {
	public static void main(String[] args) {
		
		int escolhaDoTipoLanche;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("--------------------------Bem vindos do Delivery do Java Express---------------------------");
		System.out.println("");
		System.out.println("-----------------------------------Menu de opções------------------------------------------");
		System.out.println("				[ 1 ] - Sanduíches ..... R$ 10,00 + 2,00 por ingrediente escolhido");
		System.out.println("				[ 2 ] - Massas ......... R$ (depende do sabor escolhido)");
		System.out.println("				[ 3 ] - Bolos .......... R$ 40,90");
		System.out.println("				[ 4 ] - Salgados .......... R$ 4,50");
		System.out.println("Escolha a opção desejada:");
		
		escolhaDoTipoLanche = ler.nextInt();
		
		switch (escolhaDoTipoLanche) {
	     case 1:
	       	 System.out.println("                              Para o sanduíche precisa escolher os ingredientes                            ");
	    	 System.out.println("__________________________________________________________________________________________________________________ ");
	    	 System.out.println(" ");
	    	 Sanduiche.escolherIngrediente();
	    	 break;
	     case 2:
	    	 System.out.println("                      Você escolheu Massa. Dentre as massas, você pode escolher entre:                      ");
	    	 System.out.println("___________________________________________________________________________________________________________ ");
	    	 System.out.println(" ");
	    	 Massa.escolherTipoDeMassa();
	       break;
	       
	       
	     case 3:
	    	 System.out.println("                    Você escolheu Bolo. Digite as opções de Massa, Recheio e Cobertura");
	    	 System.out.println("___________________________________________________________________________________________________________ ");
	    	 Bolo.escolherBolo();
 
	    	 break;
	     case 4:
	    	 System.out.println("                    Você escolheu Salgado. Digite o tipo de salgado desejado");
	    	 System.out.println("___________________________________________________________________________________________________________ ");
	    	 Salgado.escolherSalgado();
	    	 break;
	     default:
	       System.out.println("Número inválido");
	  }
		Pedido.agradecimento();
	
}
	
}