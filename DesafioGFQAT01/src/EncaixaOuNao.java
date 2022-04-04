/*
Desafio

Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu
que ele construísse um programa para verificar, à partir de dois valores
inteiros A e B, se B corresponde aos últimos dígitos de A.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de entrada
contém um inteiro N que indica a quantidade de casos de teste. Cada caso
de teste consiste de dois inteiros A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.

Saída
Para cada caso de entrada imprima uma mensagem indicando se o segundo valor
encaixa no primeiro valor, confome exemplo abaixo.

 */
import java.util.Scanner;

public class EncaixaOuNao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] z = new String[N];

        for (int i = 0; i < N; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            String numA = String.valueOf(A);
            String numB = String.valueOf(B);
            String lastA = numA.substring(numA.length() -1);
            String lastB = numB.substring(numB.length() -1);

            if (A >= B && numA.contains(numB) && lastA.equals(lastB))
                z[i] = "encaixa";
            else
                z[i] = "nao encaixa";
        }
        for (String i : z) {
            System.out.println(i);
        }
    }
}
