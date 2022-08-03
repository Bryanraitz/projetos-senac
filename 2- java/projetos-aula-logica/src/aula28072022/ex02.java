package aula28072022;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,c;

        System.out.println("Escreva os valores de A,B e C");
        a = teclado.nextInt();
        System.out.println("agora o valor de B");
        b = teclado.nextInt();
        System.out.println("agora o valor de C");
        c = teclado.nextInt();

        if ((a<b) && (b<c)){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        if ((b<c) && (c<a));
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);




    }
}
