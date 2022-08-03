package aula27072022;

import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os valores de A,B e C.");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        if ((a>b) && (b>c)){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        if ((b>c) && (c>a)){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        if ((c>a) && (a>b)){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        if ((c>b) && (b>a)){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        if ((b>a) && (a>c)){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        if ((a>c) && (c>b)){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }



    }
}
