import java.util.*;
public class ContaTerminal {


    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nome;
        Double saldo;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, digite o número da conta :");
        numero = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Por favor, digite a agencia:");
        agencia = scanner.next();

        scanner.nextLine();
        System.out.print("Por favor, digite o seu nome:");
        nome = scanner.nextLine();

        System.out.print("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nome,agencia,numero,saldo);

        scanner.close();
    }
}
