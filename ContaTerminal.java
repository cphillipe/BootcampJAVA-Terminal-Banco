import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) throws Exception{
        /*  TO DO: Conhecer e Importar a Classe Scanner;
            Exibir as mensagens para o nosso usuário;
            Obter pelo Scanner os valores digitados no terminal;
            Exibir a Mensagem de conta criada;
        */

        //Autenticação
        Scanner userName = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco DIO, digite seu nome de usuário para continuar.");
        
        String user = userName.nextLine();
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        double saldo = 0.0;
        String welcome = String.format("Bem vindo, %s, seu saldo atual é de %s escolha a opção que deseja acessar", user, saldo);
        System.out.println(welcome);
        System.out.println("""
                            1. Realizar Dep\u00f3sito 
                            2. Sair""");
        Scanner userInput = new Scanner(System.in);
        char inputChar = userInput.next().charAt(0);
        switch (inputChar) {
            case '1':
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Digite o valor que você deseja depositar:");
                Scanner deposito = new Scanner(System.in);
                double valorDepositado = Double.parseDouble(deposito.nextLine());
                saldo += valorDepositado;
                String saldoAtual = String.format("Seu saldo atual é de: %s", saldo);
                System.out.println(saldoAtual);
                break;
            case '2':
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Obrigado por usar nossos serviços.");
                break;
            default:   
                System.out.println("Opção Inválida");
                break;
                // throw new AssertionError();
        }
        //Menu Principal
            /*Opções:   Ver Saldo
             *          Realizar depósito
             *          Realizar saque
             *          Sair
            */
        //Mostrar saldo
            /*
             *          Mostrar Saldo
             *          Voltar
             *          Sair
             */
        //
    }
}