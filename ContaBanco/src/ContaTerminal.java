import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        float saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite o numero da agencia");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor digite o codigo da agencia");
        agencia = sc.nextLine();
        System.out.println("Por favor digite o nome do cliente");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor digite o saldo do cliente");
        saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a " +
                agencia + "conta" + numero + "e seu saldo de R$" + saldo + " está disponivel para saque");


    }
}
