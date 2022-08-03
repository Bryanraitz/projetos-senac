import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        /*Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.

         */

        int a, b = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um numero por favor");
        a = teclado.nextInt();

        if (a > 0) {
            b = a * 2;
            System.out.println("o dobro de "+ a +" e " + b);

        }
else {
            b = a * 3;
            System.out.println(" o triplo de " + a + " e " + b);
        }

    }
}
