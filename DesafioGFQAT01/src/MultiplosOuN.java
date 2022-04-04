/*
Desafio


Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando
se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
*/
import java.util.Scanner;

public class MultiplosOuN{

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        double x = leitor.nextLong();
        double y = leitor.nextLong();

        if (x % y == 0 || y % x == 0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");
    }
}

