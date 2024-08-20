import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        /* 
         *  Numero	Inteiro	1021
            Agencia	Texto	067-8
            Nome Cliente	Texto	MARIO ANDRADE
            Saldo	Decimal	237.48
        */

        /* DESAFIOS
         * 
         * Estava tentando resolver um desafio do bootcamp, onde tinha que usar a classe scanner e pedir ao usuário pra inserir a resposta no terminal. O problema veio ao precisar informar o nome completo. O método `next()` não pega o nome completo, apenas a próxima cadeia de string, ou seja, ao digitar "Lucas Gerhardt" ele só pega o Lucas e não consegue ler o Gerhardt. Enfim, tava dando esse erro. Corrigi adicionando o método `nextLine()`no lugar, porém apareceu outro problema.
            
         nextLine()
         
         Quando usamos os métodos next(), nextInt(), nextDouble() e semelhantes, o scanner lê o valor que você digitou, mas ele não "pega" a tecla Enter `(\n)` que você pressiona depois de digitar o valor. Essa tecla Enter fica "presa" no buffer de entrada.
         
         Depois disso, quando você chama `scanner.nextLine()`, ele vê essa tecla Enter que ficou no buffer e pensa que você quer dizer "ok, terminei de digitar", então ele não te dá a chance de digitar mais nada e pula direto para a próxima parte do código.
         
         Para evitar isso, a gente coloca um `scanner.nextLine()` extra logo depois de `scanner.next()`ou `scanner.nextInt()`. Esse `scanner.nextLine()` extra vai capturar a tecla Enter que ficou no buffer, limpando o caminho para que o próximo `scanner.nextLine()` realmente funcione como esperado, permitindo que você digite o nome completo sem problemas.
        */
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();
        

        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo !");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("+++++++++++++++++");

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nomeCliente,agencia,numero,saldo));
    }
}
