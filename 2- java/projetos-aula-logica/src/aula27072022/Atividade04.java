import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        int a, b, c = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um valor para A");
        a = teclado.nextInt();
        System.out.println("insira um valor para B");
        b = teclado.nextInt();

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;

        }
        System.out.println("O valor de C e: " + c);


    }
}
