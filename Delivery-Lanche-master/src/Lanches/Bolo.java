package Lanches;

import java.util.Scanner;

public class Bolo extends Lanche{
	
	private double preco;
	private String massa;
	private String recheio;
	private String cobertura;
	
	public Bolo(double preco) {
		super();
		this.preco = preco;
				
	}
	
	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	public static void escolherBolo() {
		String tipoMassa, recheio,cobertura;
		Scanner ler3 = new Scanner(System.in);
		double distancia;
		
		
		
		
		 System.out.println("-----------------------------------Qual o tipo de massa você quer?-----------------------------------------");
    	 tipoMassa = ler3.next();
    	 
    	 System.out.println("-----------------------------------Qual o tipo de recheio você quer?---------------------------------------");
    	 recheio = ler3.next();
    	 
    	 System.out.println("-----------------------------------Qual o tipo de cobertura você quer?-------------------------------------");
    	 cobertura = ler3.next();
    	 
    	 Bolo bolo1 = new Bolo(40.90);
    	 bolo1.setMassa(tipoMassa);
    	 bolo1.setRecheio(recheio);
    	 bolo1.setCobertura(cobertura);
    	 
    	 System.out.println("");
    	 System.out.println("----------------------------------------------------------------------------------------------------------- ");
    	 System.out.println("Você escolheu um bolo com massa de: " + bolo1.getMassa() + " com recheio de: " + bolo1.getRecheio() + " e cobertura de:" + bolo1.getCobertura());
    	 System.out.println("----------------------------------------------------------------------------------------------------------- ");
    	 
    	 Pedido.mensagemTempoDeEntrega();
    	 distancia = ler3.nextInt();
    	 Pedido.fecharPedido(bolo1);
    	 Pedido.calcularTempo(distancia);
   	}

}