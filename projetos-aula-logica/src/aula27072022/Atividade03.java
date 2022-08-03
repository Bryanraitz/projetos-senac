import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Insira um numero");
        num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println(" O numero " + num + " e par");

        } else {
            System.out.println(" O numero " + num + " e impar");

        }
    }
}