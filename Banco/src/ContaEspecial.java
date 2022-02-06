
public class ContaEspecial extends Conta{
	public final String ATENDIMENTO = "Priorit�rio";
	public double chequeEspecial;
	
	public ContaEspecial(String nomeUsuario, int numeroConta, double saldoConta, double chequeEspecial) {
		super(nomeUsuario, numeroConta, saldoConta);
		
		this.chequeEspecial = chequeEspecial;
	}
	
	public String getATENDIMENTO() {
		return ATENDIMENTO;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void sacar(double valorSacado) {
		if(valorSacado <= this.saldoConta) {
			this.saldoConta -= valorSacado;
			System.out.printf("Saque realizado com sucesso, seu novo saldo � de: R$ %.2f %n", this.saldoConta);
		}else if(valorSacado > this.saldoConta + this.getChequeEspecial()) {
			System.out.println("Esse valor excede seu saldo mais o seu saldo no limite do cheque especial. Insira outro valor:");
		} else if(valorSacado > this.saldoConta) {
			this.saldoConta -= valorSacado;
			this.chequeEspecial += this.saldoConta;
			System.out.println("Voc� n�o tem saldo suficiente para essa opera��o, voc� vai usar seu cheque especial.");
			System.out.printf("Seu limite especial agora � R$ %.2f %n", this.getChequeEspecial());
		}
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito <= 0) {
			System.out.printf("Deposite algum valor v�lido.%n");
		}else if(valorDeposito >= 0) {
			this.saldoConta += valorDeposito;
			System.out.printf("Dep�sito realizado com sucesso!%n");
			System.out.printf("Seu novo saldo � de: R$ %.2f %n", this.saldoConta);
		}else if(valorDeposito < Math.abs(this.saldoConta)){
			this.chequeEspecial += valorDeposito;
			this.saldoConta += valorDeposito;
		}else{
			this.chequeEspecial += Math.abs(this.saldoConta);
			this.saldoConta += valorDeposito;
		}
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.printf("Valor do cheque especial: R$ %.2f", chequeEspecial);
		System.out.printf("%nAtendimento: %s %n", ATENDIMENTO);
		System.out.println("-------------------------------");
	}
}
