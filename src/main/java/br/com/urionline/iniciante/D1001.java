/**
 * User: phmiranda
 * Project: torneio
 * Description: Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 * Date: 07/07/2020
 */

package br.com.urionline.iniciante;

public class D1001 {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número.");
        System.out.println("Digite o segundo número.");
        int a, b, x;
        a = 10;
        b = 9;

        x = a + b;

        System.out.println("X = " + x);
    }
}
