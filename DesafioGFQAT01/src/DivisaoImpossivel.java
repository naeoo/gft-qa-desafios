/*
Desafio

Você terá o desafio de escrever um algoritmo que leia 2 números e
imprima o resultado da divisão do primeiro pelo segundo. Caso não for
possível, mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de
        pares de valores inteiros (X e Y) que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o
ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class DivisaoImpossivel {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        double x, y;
        String[] z = new String[N];

        for (int i = 0; i < N; i++) {
            x = leitor.nextDouble();
            y = leitor.nextDouble();

            if (y == 0) {
                z[i] = "divisao impossivel";
            } else {
                double divisao = (x / y);
                z[i] = df.format(divisao);
            }
        }
        for (String i : z){
            System.out.println(i);
        }
    }
}