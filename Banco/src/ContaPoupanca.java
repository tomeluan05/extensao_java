
public class ContaPoupanca extends Conta{
	public final double FATOR_RENDIMENTO = 0.10;
	
	public ContaPoupanca(String nomeUsuario, int numeroConta, double saldoConta) {
		super(nomeUsuario, numeroConta, saldoConta);
	}

	public double getFATOR_RENDIMENTO() {
		return FATOR_RENDIMENTO;
	}

	public void depositar(double valor) {
		if(valor > 0) {
			this.saldoConta += valor;
			System.out.printf("Depósito realizado com sucesso, seu novo saldo é de R$ %.2f %n", this.saldoConta);
		}else {
			System.out.println("Insira algum dinheiro");
		}
	}
	
	public void sacar(double valor) {
		if(valor > this.saldoConta) {
			System.out.printf("Saldo insuficiente, digite outro valor.%n");
		}else {
			this.saldoConta -= valor;
			System.out.printf("Saque efetuado com sucesso, seu novo saldo é de R$ %.2f %n", this.saldoConta);
		}
	}
	
	public double rendimento() {
		return this.saldoConta += (FATOR_RENDIMENTO * this.saldoConta);
	}
	
	public void exibirDados() {
		super.exibirDados();
		double recebeRendimento = this.FATOR_RENDIMENTO * this.saldoConta;
		System.out.printf("Sua conta está rendendo no momento: R$ %.2f%n", recebeRendimento);
		System.out.println("-------------------------------");

	}
}
