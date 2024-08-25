import java.util.Scanner;

public class ContaTerminal{

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola, Bem vindo ao sistema bancario!");
        System.out.println("Deseja criar uma conta?  S = Sim | N = Nao");
        String criarConta = scanner.next();

        if (criarConta.equals("n")){
            System.out.println("Ok, ate a proxima!");
        }
        else{
            System.out.println("Primeiro digite seu nome:");
            String primeiroNome = scanner.next().toUpperCase();

            System.out.println("Agora o seu sobrenome:");
            String ultimoNome = scanner.next().toUpperCase();

            System.out.println("Informe a sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Informe a sua agencia:");
            String numeroAgencia = scanner.next();

            System.out.println("Informe o numero da conta:");
            int numeroConta = scanner.nextInt();

            System.out.println("Agora informe o seu saldo atual:");
            double saldoAtual = scanner.nextDouble();


            System.out.println("Muito bem! " + primeiroNome + " " + ultimoNome + ", obrigado por criar sua conta conosco. A sua agencia e: " + numeroAgencia + ", o numero de sua conta e: " + numeroConta + ", e seu saldo atual e: R$" + saldoAtual);
        }
        
    
    }
}