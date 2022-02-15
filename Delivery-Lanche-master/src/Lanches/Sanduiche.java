package Lanches;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanduiche extends Lanche{
	private double tempoTotal;
	private double preco;
		
	List<String> ingredientes = new ArrayList<>();
	
	public void setIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);
		
	}
	
	public void getIngrediente() {
		System.out.println("  Voc� escolheu os ingredientes: " + this.ingredientes);
		
	}
	
	public Sanduiche() {
		
	}
    
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public static void escolherIngrediente() {
		int escolhaDoIngrediente=11, contador=0;
		double distancia, quantIngrediente = -1;
		Sanduiche lanche1 = new Sanduiche();
		
		
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("__________________________________________________________________________________________________________________");
		System.out.println("                            1 - queijo        2 - presunto       3 - bacon          4 - alface ");
		System.out.println("                            5 - tomate        6 - catupiry       7 - maionese       8 - abacaxi ");
		System.out.println("                            9 - batata Palha  10 - mostarda      0 - para encerrar a escollha");
		System.out.println(" ");
		System.out.println("                            Voc� pode escolher at� 10 ingredientes: ");
		System.out.println("__________________________________________________________________________________________________________________");
		
		while ((contador < 10) && escolhaDoIngrediente != 0) {
					
			System.out.println("                        Digite o n�mero do ingrediente ou [0] para encerrar a escolha ");
				
			escolhaDoIngrediente = lerDados.nextInt();
			
			switch (escolhaDoIngrediente) {
		     	case 1:
		     		lanche1.setIngrediente("queijo");
		     		break;
		     	case 2:
		     		lanche1.setIngrediente("preseunto");
		     		break;
		     	case 3:
		     		lanche1.setIngrediente("bacon");
		     		break;
		     	case 4:
		     		lanche1.setIngrediente("alface");
		     		break;
		     	case 5:
		     		lanche1.setIngrediente("tomate");
		     		break;
		     	case 6:
		     		lanche1.setIngrediente("catupiry");
		     		break;	
		     	case 7:
		     		lanche1.setIngrediente("maionese");
		     		break;
		     	case 8:
		     		lanche1.setIngrediente("abacaxi");
		     		break;
		     	case 9:
		     		lanche1.setIngrediente("batata pallha");
		     		break;	
		     	case 10:
		     		lanche1.setIngrediente("mostarda");
		     		break;
		     	case 0:
		     		break;	
		     	default:
		       		System.out.println("N�mero inv�lido");
		     }
			contador++;
			quantIngrediente++;
			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
			lanche1.getIngrediente();
			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
			System.out.println(" ");
			
			
		}
		lanche1.setPreco(10 + quantIngrediente * 2);
		Pedido.mensagemTempoDeEntrega();
		distancia = lerDados.nextInt();
		Pedido.fecharPedido(lanche1);
   	 	Pedido.calcularTempo(distancia);
		
	}	
	
	

}
