import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e import a classe Scanner.
        //Exibir as mensagens para o nosso Usuário
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada.
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Cadastro Conta");
            System.out.println("Digite seu nome:");
            String nomeCliente = sc.nextLine();
            System.out.println("Digite o numero da Agência:");
            String agencia = sc.nextLine();
            System.out.println("Digite o numero da Conta:");
            int numero = sc.nextInt();
            double saldo = 237.48;
            System.out.println("Olá " + nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "," +
                    " conta " + numero + " e seu saldo de R$" + saldo + " já está disponivel para saque.");
        } catch (NumberFormatException e){
            System.out.println("houve erro na conversão, digite valores validos");

        }
    }
}