/*
 * Author: phmiranda
 * Project: torneio
 * Task Number: 1002
 * Description: https://www.beecrowd.com.br/judge/pt/problems/view/1002
 * Date: 28/04/2022
 */

package br.com.phmiranda.torneio.problemas;

import java.util.Scanner;

public class P1002 {
    public static void main(String[] args) {
        Double area;
        Double raio;
        Double constante = 3.14159;

        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O VALOR DO RAIO: ");

        raio = scanner.nextDouble();

        area = constante * (raio * raio);

        System.out.println("AREA DO CIRCULO: " + area);
    }
}
