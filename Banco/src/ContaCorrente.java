
public class ContaCorrente extends Conta{
	
	private final String ATENDIMENTO = "Sem prioridades";
	
	public ContaCorrente(String titularConta, int numeroConta, double saldoConta) {
		super(titularConta, numeroConta, saldoConta);	
	}
	
	public String getAtendimento() {
		return ATENDIMENTO;
	}
	
	public void sacar(double valorSaque) {
		System.out.printf("%n------------------" + this.getTitular() + "------------------%n");
		if(valorSaque <= this.saldoConta) {
			this.saldoConta -= valorSaque;
			System.out.printf("Saque efetuado com sucesso, seu novo saldo é de %.2f . %n", this.getSaldo());
		}else {
			System.out.printf("Saldo insuficiente. %nVocê não pode sacar R$%.2f, pois seu saldo é de R$%.2f .%n", valorSaque, getSaldo());
		}
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito > 0) {
			this.saldoConta += valorDeposito;
			System.out.printf("Depósito realizado com sucesso, seu novo saldo é de %.2f .%n", this.getSaldo());
		}else {
			System.out.println("Deposite algum valor.");
		}
	}
	
	public void exibirDados() {
		super.exibirDados();;
		System.out.println("Atendimento: " + this.getAtendimento());
		System.out.println("-------------------------------");
	}
}
