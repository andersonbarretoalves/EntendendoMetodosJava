package Ex1;

import java.util.Scanner;

/*Criar uma aplicação que calcule as 4 operações básicas:
 soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.*/
public class Calculador {
    public static void main(String[] args) {
        calcule();
    }

    public static void calcule() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = scan.nextByte();
        System.out.println("Digite o segundo número: ");
        double numero2 = scan.nextByte();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println(" O Resultado da Soma: " + soma);
        System.out.println(" O Resultado da Subtração: " + subtracao);
        System.out.println(" O Resultado da Multiplicação: " + multiplicacao);
        System.out.println(" O Resultado da Divisão: " + divisao);

    }

}