import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor, digite o número da Agência:");
		String agencia = scanner.nextLine();

		System.out.println("Por favor, agora digite o número da Conta:");
		int numero = scanner.nextInt();

		System.out.println("Me informe seu nome: ");
		String nomecliente = scanner.next();
		scanner.nextLine();

		System.out.println("Agora me informa seu saldo atual: ");
		double saldo = scanner.nextDouble();


		System.out.printf("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numero + "e seu saldo " + saldo + " já está disponível para saque.");
	}

}