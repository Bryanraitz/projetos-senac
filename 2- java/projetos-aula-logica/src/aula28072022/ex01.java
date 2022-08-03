package aula28072022;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double n1,n2,n3, media =0;

        System.out.println("Qual seu nome?");
        nome = teclado.next();
        System.out.println("insira sua primeira nota");
        n1 = teclado.nextDouble();
        System.out.println("insira sua segunda nota");
        n2 = teclado.nextDouble();
        System.out.println("insira sua terceira nota");
        n3 = teclado.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media >= 8.0) {
            System.out.println(nome + " Foi aprovado com media " + media);
        } else {
            System.out.println(nome + " Foi reprovado com media" + media);

        }



    }
}
