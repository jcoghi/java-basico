
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da conta");
        int numero = input.nextInt();
        System.out.println("Informe o numero da agencia");
        String agencia = input.next();
        System.out.println("Digite seu nome");
        String nome = input.nextLine();
        input.next();
        System.out.println("Informe seu saldo atual");
        float saldo = input.nextFloat();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
                + "sua agência é %s, conta %d e seu saldo de R$%.2f está disponível para saque",
                nome, agencia, numero, saldo);
        input.close();
    }
}
