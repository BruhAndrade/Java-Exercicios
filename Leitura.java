import java.util.Scanner;

public class Leitura {
    public static void main(String args[]) {
        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner teclado = new Scanner(System.in);

        // Declaração de variáveis
        int valorInteiro;
        float valorFloat;

        // Solicita ao usuário que digite um valor inteiro
        System.out.println("Por favor, digite um valor inteiro");
        
        // Lê o valor inteiro da entrada do teclado
        valorInteiro = teclado.nextInt();

        // Solicita ao usuário que digite um valor real (float)
        System.out.println("Por favor, digite um valor real");
        
        // Lê o valor real (float) da entrada do teclado
        valorFloat = teclado.nextFloat();

        // Imprime os valores digitados pelo usuário
        System.out.println("Você digitou os valores " + valorInteiro + " e " + valorFloat);

        // Fecha o objeto Scanner após a leitura
        teclado.close();
    }
}
