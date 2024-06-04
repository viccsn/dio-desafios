import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite sua Agência: ");
        String nomeAgencia = scanner.nextLine();

        System.out.println("Digite seu número: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldoCliente = scanner.nextDouble();
        
        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + 
        nomeAgencia + " conta " + numeroConta + " e seu saldo de " + saldoCliente + " já está disponível para saque.");
    }
}
