import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		ContaCorrente usuario1 = new ContaCorrente("Tomé Luan", 43123, 300.00);
		
		usuario1.exibirDados();
		usuario1.depositar(5);
		usuario1.exibirDados();

		sc.close();
		
	}

}
