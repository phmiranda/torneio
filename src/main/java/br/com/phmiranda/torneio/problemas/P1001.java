/*
 * Author: phmiranda
 * Project: torneio
 * Task Number: 1001
 * Description: https://www.beecrowd.com.br/judge/pt/problems/view/1001
 * Date: 26/04/2022
 */

package br.com.phmiranda.torneio.problemas;

import java.util.Scanner;

public class P1001 {
    public static void main(String[] args) {
        // Declaração das variáveis;
        Integer a;
        Integer b;
        Integer x;

        // Leitura de dados
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        a = scanner.nextInt();

        System.out.println("DIGITE O SEGUNDO VALOR: ");
        b = scanner.nextInt();

        // Calcula a soma dos dois valores
        x = a + b;

        // Imprime o resultado na tela para o usuário
        System.out.println("X = " + x);
    }
}
