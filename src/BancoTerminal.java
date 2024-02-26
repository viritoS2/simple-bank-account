import java.util.Scanner;

public class BancoTerminal {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = keyboard.next();
        System.out.println("Agência: " + numeroAgencia);

        System.out.println("Digite o numero da conta: ");
        Integer numeroConta  = keyboard.nextInt();
        System.out.println("Conta: " + numeroConta);

        System.out.println("Digite seu nome: ");
        String nomeCliente = keyboard.next();
        System.out.println("Usuário: " + nomeCliente);

        System.out.println("Digite seu saldo: ");
        Double saldoCliente = keyboard.nextDouble();
        System.out.println("Saldo: " + saldoCliente + "\n");

        System.out.println("Olá "+ nomeCliente +
                " obrigado por criar uma conta em nosso banco, sua agência é  " + numeroAgencia +
                " conta " + numeroConta + " e seu saldo " + saldoCliente + " já está disponível para saque");
    }
}