
public class Conta {
	public String titularConta;
	public int numeroConta;
	public double saldoConta;
	
	public Conta(String titularConta, int numeroConta, double saldoConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}
	
	public int getNumero() {
		return numeroConta;
	}

	public String getTitular() {
		return titularConta;
	}

	public void setTitular(String titular) {
		this.titularConta = titular;
	}

	public double getSaldo() {
		return saldoConta;
	}
	
	public void exibirDados() {
		System.out.printf("%n-----------%s-----------%n", this.getTitular());
		System.out.println("Titular da conta: " + this.getTitular());
		System.out.println("Número da conta: " + this.getNumero());
		System.out.printf("Saldo da conta: R$ %.2f %n", this.getSaldo());
	}
}
