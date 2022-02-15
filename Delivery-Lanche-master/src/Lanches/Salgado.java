package Lanches;

import java.util.Scanner;

public class Salgado extends Lanche{
	private String massa;
	private double preco;
	public Salgado(double preco) {
		super();
		this.preco = preco;
				
	}
	
	public static void escolherSalgado() {
		String tipoSalgado;
		Scanner lerSalgado = new Scanner(System.in);
		double distancia;

		
		
		 System.out.println("-----------------------------------Você quer o seu salgado frito ou assado?-----------------------------------------");
    	 tipoSalgado = lerSalgado.next();
    	 
    	 Salgado salgado = new Salgado(4.50);
    	 salgado.setMassa(tipoSalgado);
    	 
    	 System.out.println("");
    	 System.out.println("----------------------------------------------------------------------------------------------------------- ");
    	 System.out.println("Você escolheu seu salgado com a massa: " + salgado.getMassa());
    	 System.out.println("----------------------------------------------------------------------------------------------------------- ");
    	 
    	 Pedido.mensagemTempoDeEntrega();
    	 distancia = lerSalgado.nextInt();
    	 Pedido.fecharPedido(salgado);
    	 Pedido.calcularTempo(distancia);
   	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
