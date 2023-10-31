import java.util.Scanner;

public class TestIf {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner teclado = new Scanner(System.in);

        // Declaração de variáveis
        double n1, n2, me;

        // Solicita ao usuário que digite a nota n1
        System.out.print("Digite a N1: ");
        n1 = teclado.nextDouble();

        // Solicita ao usuário que digite a nota n2
        System.out.print("Digite a N2: ");
        n2 = teclado.nextDouble();

        // Calcula a média das notas
        me = (n1 + n2) / 2;

        // Imprime a média final
        System.out.println("Sua media final vale: " + me);

        // Verifica se o aluno foi aprovado ou reprovado
        if (me >= 6) {
            System.out.println("Parabéns, aprovado!");
        } else {
            System.out.println("Reprovou, sei que dói, meu amigo!");
        }

        // Imprime uma mensagem de fim do programa
        System.out.println("Fim do programa!");

        // Fecha o objeto Scanner após a leitura
        teclado.close();
    }
}
