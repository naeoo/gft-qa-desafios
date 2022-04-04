/*
Desafio

Tento como base a hora inicial e final de um jogo, calcule a
duração do dele, sabendo que o mesmo pode começar em um dia e
terminar em outro, tendo uma duração mínima de, 60 minutos e
máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora
de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
*/
import java.util.Scanner;

public class TempoJogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;

        inicio = 24;
        fim = 24;


        while (0 > inicio || inicio > 23) {
            inicio = Math.abs(scan.nextInt());
        }
        while (fim < 0 || fim > 23) {
            fim = Math.abs(scan.nextInt());
        }
        if (inicio > fim) {
            horas = (fim + 12) - (inicio - 12);
            if (horas == 1)
                System.out.println("O JOGO DUROU " + horas + " HORA(S)");
            else
                System.out.println("O JOGO DUROU " + horas + " HORA(S)");

        } else if (inicio < fim) {
            horas = fim - inicio;
            if (horas == 1)
                System.out.println("O JOGO DUROU " + horas + " HORA(S)");
            else
                System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        } else if (inicio == fim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}

