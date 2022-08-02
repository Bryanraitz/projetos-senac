package aula27072022;


import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {
        int num = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um numero");
        num = teclado.nextInt();

        if (num % 2 == 0) {
            num = num + 5;
            System.out.println("Ficou " + num + " somando mais 5");
        } else {
            num = num + 8;
            System.out.println("Ficou " + num + " somando mais 8");


        }
    }
}


