import java.util.Scanner;

public class Exercicio01 {
    public void main(String args[]) {
        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner teclado = new Scanner(System.in);

        // Declaração de variáveis
        int numeroOriginal, c, d, u, resto, novoNumero;

        // Solicita ao usuário que digite um número de 3 dígitos
        System.out.println("Digite um numero de 3 digitos: ");
        numeroOriginal = teclado.nextInt();

        // Separa as centenas (c), dezenas (d) e unidades (u)
        c = numeroOriginal / 100;
        resto = numeroOriginal % 100;
        d = resto / 10;
        u = resto % 10;

        // Reorganiza os dígitos para formar o novo número
        novoNumero = u * 100 + d * 10 + c;

        // Imprime o novo número
        System.out.println("O Novo numero vale = " + novoNumero);

        // Fecha o objeto Scanner após a leitura
        teclado.close();
    }
}