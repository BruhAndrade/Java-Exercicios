//se B for maior do que C e
//se D for maior do A, e
// a soma de C com D for maior que a soma de A e B e 
//Se a variavel A for par 

//escrever a mensagem "Valores aceitos", senão escrever"valores não aceitos"
import java.util.Scanner;

public class BC1035() {
    public static void main(String args[]) {
        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner teclado = new Scanner(System.in);
        
        // Declaração das variáveis A, B, C e D
        int A, B, C, D;
        
        // Lê os valores de A, B, C e D a partir da entrada do teclado
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        // Verifica as condições especificadas no problema
        if ((B > C) && (D > A) && (C + D > A + B) && (C > 0 && D > 0) && (A % 2 == 0)) {
            // Se todas as condições forem atendidas, imprime "Valores aceitos"
            System.out.println("Valores aceitos");
        } else {
            // Caso contrário, imprime "Valores não aceitos"
            System.out.println("Valores não aceitos");
        }
        
        // Fecha o objeto Scanner após a leitura
        teclado.close();
    }
}
