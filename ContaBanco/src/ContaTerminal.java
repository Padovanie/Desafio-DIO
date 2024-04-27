import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        int numeroConta;
        String agencia, nomeCliente;
        float saldo;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta:");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        agencia = sc.next();


        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo:");
        saldo = sc.nextFloat();
        sc.close();

        System.out.println("Olá " + nomeCliente + ", sua conta foi criada com sucesso! Obrigado por escolher nosso banco!\nSua agência é: " + agencia + ", conta: " + numeroConta + " e seu saldo de " +  saldo + " já está disponível para saque!");

    }
}
