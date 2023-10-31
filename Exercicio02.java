import java.util.Scanner;
public class Exercicio02(){
    public void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double raio, altura, V;

        //entrada
        System.out.print("Digite o raio do clilindro: ");
        raio = teclado.nextDouble();

        //processamento
        V = 3.14 * raio * altura;

        //saida - formatada
        System.out.printf("O volume do cilindro vale %.3f cm3\n", V);
        

        teclado.close;
    }
}