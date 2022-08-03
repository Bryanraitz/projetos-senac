package aula27072022;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peso = 0;
        double alt =0;
        double imc = 0;
        System.out.println("Vamos calcular seu IMC");
        System.out.println("Qual seu peso?");
        peso = teclado.nextDouble();
        System.out.println("Qual sua altura?");
        alt = teclado.nextDouble();

        imc = peso / (alt * alt);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso!");
        } else {
            if ((imc >= 18.5) && (imc < 25)) {
                System.out.println("Peso normal");
            } else {
                if ((imc >= 25) && (imc < 30)) {
                    System.out.println("acima do peso!");
                } else {
                    System.out.println("Obeso!");

                }
            }


        }
    }
}
