import java.util.Scanner;

public class atividade08 {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int a, b, c = 0;
        int maior = 0, meio = 0, menor = 0;
        System.out.println("Digite tres numeros diferentes:");
        a = tecla.nextInt();
        b = tecla.nextInt();
        c = tecla.nextInt();


        if ((a > b) && (a > c)) {
            maior = a;
            if (b > c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        } else {

            if ((b > a) && (b > c)) {
                maior = b;
                if (a > c) {
                    meio = a;
                    menor = c;
                } else {
                    meio = c;
                    menor = a;
                }
            } else {

                if ((c > a) && (c > b)) {
                    maior = c;
                    if (a > b) {
                        meio = a;
                        menor = b;
                    } else {
                        meio = b;
                        menor = a;
                    }
                }
            }
        }
        System.out.println("A ordem decrescente é: " + maior + ", " + meio + ", " + menor);
    }
}