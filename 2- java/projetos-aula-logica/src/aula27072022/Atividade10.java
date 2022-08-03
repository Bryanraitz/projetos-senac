package aula27072022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        double pesoa = 0;
        double pesoi = 0;
        double h = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu sexo por favor (F/M):");
        String sexo = teclado.next();
        System.out.println("Qual sua altura?");
        h = teclado.nextDouble();
        System.out.println("Qual e seu peso atualmente?");
        pesoa = teclado.nextDouble();

        if (sexo.equals("F")) {
            pesoi = (62.1 * h) - 44.7;
        } else {
            pesoi = ((72.7 * h) - 58);
        }
        if (pesoi >= pesoa) {
            System.out.println("Voce esta no seu peso ideal!");
        } else {
            System.out.println("Voce nao esta no peso ideal!");
        }





    }
}
