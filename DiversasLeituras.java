import java.util.Scanner;//importando a biblioteca 

import java.util.Scanner;

public class DiversasLeituras {
    public static void main(String args[]) {
        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner teclado = new Scanner(System.in);

        // Declaração das variáveis
        int codigo;
        double preco;
        String nome, texto;

        // Solicita ao usuário que digite o código
        System.out.print("Digite o codigo: ");

        // Lê a entrada do usuário como uma linha de texto
        texto = teclado.nextLine();

        // Converte o texto lido em um número inteiro (código)
        codigo = Integer.parseInt(texto);

        // Solicita ao usuário que digite o nome
        System.out.print("Digite o nome: ");
        
        // Lê a entrada do usuário como uma linha de texto
        nome = teclado.nextLine();

        // Solicita ao usuário que digite o preço
        System.out.print("Digite o preco: ");
        
        // Lê a entrada do usuário como uma linha de texto
        texto = teclado.nextLine();

        // Converte o texto lido em um número decimal (preço)
        preco = Double.parseDouble(texto);

        // Imprime os valores digitados pelo usuário
        System.out.println("Você digitou " + codigo + " - " + nome + " R$" + preco);

        // Imprime os valores digitados com formatação
        System.out.printf("Você digitou %d - %s R$ %.2f\n", codigo, nome, preco);
        
        // Fecha o objeto Scanner após a leitura
        teclado.close();
    }
}

