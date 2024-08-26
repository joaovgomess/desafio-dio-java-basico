import java.util.Random;
import java.util.Scanner;

public class ContaTerminal{

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ola, Bem vindo ao sistema bancario!");
        
        String criarConta;
        do{
            System.out.println("Deseja criar uma conta?  S = Sim | N = Nao");
            criarConta = scanner.next().toLowerCase();
        
            if (criarConta.equals("n")){
                System.out.println("Ok, ate a proxima!");
            }
            else if (!criarConta.equals("Por favor, insira uma resposa valida.")) {
                
            }
        } while(!criarConta.equals("s"));

        System.out.println("Primeiro digite seu nome:");
        String primeiroNome = scanner.next().toUpperCase();

        System.out.println("Agora o seu sobrenome:");
        String ultimoNome = scanner.next().toUpperCase();

        System.out.println("Informe a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Informe o valor de seu deposito inicial:");
        double saldoAtual = scanner.nextDouble();

        int numeroConta = random.nextInt(100000);
        
        while(numeroConta < 10000){
        numeroConta = random.nextInt(100000);
        }

        int primeiraParteAgencia = random.nextInt(1000);
        int segundaParteAgencia =random.nextInt(100);

        String numeroAgencia = primeiraParteAgencia + "-" + segundaParteAgencia;

        System.out.println("\n\nMuito bem! \n" + primeiroNome + " " + ultimoNome + ", obrigado por criar sua conta conosco. \nA sua agencia: " + numeroAgencia + "\nO numero de sua conta: " + numeroConta + "\nSeu saldo atual: R$" + saldoAtual + "\n\n");
    

        scanner.close();
        
    }
}