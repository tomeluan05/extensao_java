package Lanches;

import java.util.Scanner;

public abstract class Massa extends Lanche{
	
	private double preco;
	private String molho;
	private double tempoTotal;
	private int escolhaDoTipoMolho;
	private String molhoEscolhido;
	private String sabor;
	
	
	
	
	public Massa() {
	//	super();
	//	this.preco = preco;
		// TODO Auto-generated constructor stub
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	//public double getPreco() {
	//	return super.preco;
	//}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(double tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String escolherMolho() {
			
			
		System.out.println("                                          Voc� tamb�m deve escolher o molho:");
		System.out.println("");
		   
			Scanner ler3 = new Scanner(System.in);
	       
			System.out.println("____________________________________________Menu de op��es____________________________________________________________");
			System.out.println("                                            [ 1 ] - Molho ao Sugo ");
			System.out.println("                                            [ 2 ] - Molho branco");
			System.out.println("                                            [ 3 ] - Molho bolonhesa");
			System.out.println(" Escolha a op��o desejada:");
	       
			escolhaDoTipoMolho = ler3.nextInt();
	       
			switch (escolhaDoTipoMolho) {
				case 1:
	       			molhoEscolhido =  "Molho ao Sugo";
	       			break;
	       		case 2:
	       			molhoEscolhido = "Molho branco";
	       			break;
	       		case 3:
	       			molhoEscolhido = "Molho bolonhesa";
	       			break;
	       		default:
	       			System.out.println("N�mero inv�lido");
	       }
		return molhoEscolhido;
	}
	
	public String getMolho() {
		return this.molho;
	}
	
	public static void escolherTipoDeMassa() {
		int escolhaDoTipoMassa, escolhaTipoPizza;
		double distancia;
		Scanner lerDados = new Scanner(System.in);
		
		Scanner ler2 = new Scanner(System.in);
		
		
		System.out.println("__________________________________Menu de op��es____________________________________________________________");
		System.out.println(" ");
		System.out.println("                                  [ 1 ] - Macarr�o...........R$ (escolher o tipo)");
		System.out.println("                                  [ 2 ] - Pizza .............R$ (escolher o sabor)");
		System.out.println("                                  [ 3 ] - Lasanha ...........R$ 45.90");
		System.out.println(" Escolha a op��o desejada:");
		System.out.println("  ");
		
		
		
		
		
		escolhaDoTipoMassa = ler2.nextInt();
       
		switch (escolhaDoTipoMassa) {
       		case 1:
       			Massa massa1 = new Macarrao();
       			massa1.setMolho(massa1.escolherMolho());
       			System.out.println("__________________________________Tipos de macarr�o a escolher______________________________________________");
       			System.out.println(" ");
       			System.out.println("                                  [ 1 ] - Talaharim ...... R$ 28,40");
       			System.out.println("                                  [ 2 ] - Pene ........... R$ 36,70");
       			System.out.println("                                  [ 3 ] - Parafuso ....... R$ 39,00");
       			System.out.println(" Escolha a op��o desejada:");
       			System.out.println("  ");
       			
       			escolhaTipoPizza = lerDados.nextInt();
       			switch (escolhaTipoPizza) {
		     	case 1:
		     		massa1.setSabor("Talharim");
		     		massa1.setPreco(28.40);
		     		
		     		break;
		     	case 2:
		     		massa1.setSabor("Pene");
		     		massa1.setPreco(36.70);
		     		break;
		     	case 3:
		     		massa1.setSabor("Parafuso");
		     		massa1.setPreco(39.00);
		     		break;
		     	
		     	default:
		       		System.out.println("N�mero inv�lido");
		     }
       			
       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
       			System.out.println("                           Voc� escolheu macarr�o " + massa1.getSabor() + " e o molho escolhido foi: " + massa1.getMolho());
       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
       			Pedido.mensagemTempoDeEntrega();
       			distancia = lerDados.nextInt();
     			massa1.fecharPedido();
     			Pedido.calcularTempo(distancia);
       			break;
       		case 2:
       			Massa massa2 = new Pizza();
       			massa2.setMolho(massa2.escolherMolho());
       			
       			System.out.println("__________________________________Sabores de pizzas dispon�veis______________________________________________");
       			System.out.println(" ");
       			System.out.println("                                  [ 1 ] - Calabreza ...... R$ 36,40");
       			System.out.println("                                  [ 2 ] - Atum ........... R$ 40,60");
       			System.out.println("                                  [ 3 ] - 4 queijos ...... R$ 41,00");
       			System.out.println(" Escolha a op��o desejada:");
       			System.out.println("  ");
       			
       			escolhaTipoPizza = lerDados.nextInt();
       			switch (escolhaTipoPizza) {
		     	case 1:
		     		massa2.setSabor("Calabreza");
		     		massa2.setPreco(36.40);
		     		
		     		break;
		     	case 2:
		     		massa2.setSabor("Atum");
		     		massa2.setPreco(40.60);
		     		break;
		     	case 3:
		     		massa2.setSabor("4 queijos");
		     		massa2.setPreco(41.00);
		     		break;
		     	
		     	default:
		       		System.out.println("N�mero inv�lido");
		     }
       			
       			
       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
       			System.out.println("                            Voc� escolheu pizza de " + massa2.getSabor() + " e o molho escolhido foi: " + massa2.getMolho());
       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
       			Pedido.mensagemTempoDeEntrega();
       			distancia = lerDados.nextInt();
       			massa2.fecharPedido();
       			Pedido.calcularTempo(distancia);
       			break;
       		case 3:
       			Massa massa3 = new Lasanha();
       			massa3.setPreco(45.90);
       			massa3.setMolho(massa3.escolherMolho());
       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
       			System.out.println("                            Voc� escolheu lasanha e o molho escolhido foi: " + massa3.getMolho());
       			System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
       			Pedido.mensagemTempoDeEntrega();
       			distancia = lerDados.nextInt();
       			massa3.fecharPedido();
       			Pedido.calcularTempo(distancia);
       			break;
       		default:
       			System.out.println("N�mero inv�lido");
       }
	}
	
	
	
	public abstract void fecharPedido();
	
	
	
}
