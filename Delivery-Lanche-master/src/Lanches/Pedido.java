package Lanches;

public class Pedido extends Lanche{
	
	public static void mensagemTempoDeEntrega() {
		System.out.println(" _______________________________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println("                Para cálculo do tempo de entrega, precisamos saber a distância até sua casa! ");
		System.out.println(" ");
		System.out.println(" Qual a distância da sua casa? (em km) ");
	}
	
	public static void agradecimento() {
		System.out.println(" _______________________________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println("                Agradecemos a sua preferência e desejamos bom apetite!!!");
		System.out.println(" ");
		
	}

	public static void calcularTempo(double distancia) {
		double inteira, resto, tempoTotal;
		tempoTotal = (distancia * 10) + 30;
		inteira = tempoTotal / 60;
		
		resto = tempoTotal % 60;
		
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		System.out.println("  Tempo total para entrega: " + (int)inteira + " hora(s) e " + resto + " minuto(s)" );
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		
	}
	
	public static void fecharPedido(Lanche lanche) {
		
		System.out.println("---------------------Seu pedido foi realizado com sucesso--------------------------------------------------------- ");
		System.out.printf("  Seu pedido ficou em: R$%.2f %n",lanche.getPreco());
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}

}
