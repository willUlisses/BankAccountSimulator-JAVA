import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a agencia do cliente \n");
        String agencia = scanner.nextLine();

        System.out.println("informe o nome do cliente: \n");
        String nome = scanner.nextLine();

        System.out.println("Digite o numero do cliente:: ");
        int numero = scanner.nextInt();

        System.out.println("Informe o saldo do cliente: \n");
        float saldo = scanner.nextFloat();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " " +
                "já está disponível para saque!");
    }
}
