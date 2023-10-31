import java.util.Scanner;
 public class Exercicio03(){
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

    //entrada
    System.out.print("Digite o valor do salario minimo: ");
    salarioMinimo = teclado.nextDouble();
    System.out.print("Digite a quantidade de gastos: ");
    qtdkw =teclado.nextDouble();

    //processamento 
    //parte 1 - saber quanto custa 1 kw
    valorKw = salarioMinimo / 7.0 / 100.0;
    //parte 2 - saber o valor da conta total
    valorTotal = qtdKw * valorKw;
    //parte 3 - saber o valor com desconto
    valorComDesconto = valorTotal * 0.9;

    //saida
    System.out.printf("O valor de 1 kw              R$ %.2f\n", valor);
    System.out.printf("O valor total da conta R$ %.2f\n",valorTotal);
System.out.printf("O valor com desconto  R$%.2f\n", valorComDesconto);


        teclado.close;
    }
 }