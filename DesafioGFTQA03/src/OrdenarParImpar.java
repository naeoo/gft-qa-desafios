/*
Desafio

Crie um programa onde você receberá valores inteiros
não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

    Primeiro os Pares
    Depois os Ímpares

Você deve exibir os pares em ordem crescente e na sequência
os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir. As próximas N
linhas terão, cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.

 */
import java.util.*;
import java.util.stream.Collectors;

public class OrdenarParImpar {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        count = sc.nextInt();

        for(int i = 0; i < count; i++) {
            numeros.add(sc.nextInt());
        }

        Collections.sort(numeros);

        List<Integer> numerosPares = numeros.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        numeros.sort(Collections.reverseOrder());

        List <Integer> numerosImpares = numeros.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());

        numerosPares.stream()
                        .forEach(System.out::println);

        numerosImpares.stream()
                .forEach(System.out::println);
    }
}