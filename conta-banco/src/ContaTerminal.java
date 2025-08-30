import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // ToDO: Conhecer e importar a classee Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSeja bem vindo ao sistema ContaBanco. \n\nPor gentileza, informe seu nome:");
        var name = scanner.next();

        System.out.println("\nPor gentileza, informe o número de sua agência:");
        var numeroAgencia = scanner.next();

        System.out.println("\nPor gentileza, informe o número da conta:");
        var numeroConta = scanner.next();

        System.out.println("\nPor gentileza, informe o seu saldo:");
        var saldoConta = scanner.next();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.\n\n", name, numeroAgencia, numeroConta, saldoConta);

        scanner.close();
    }
}
