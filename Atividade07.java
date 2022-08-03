import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c = 0;
        int maior = 0, meio = 0, menor = 0;


        System.out.println("Digites os valores de A,B e C");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        if ((a > b) && (a > c)) {
            maior = a;
            if (b > c) {
                meio = b;
                menor = c;
            }
        } else {
            meio = c;
            menor = b;
        }
        if ((b > a) && (b > c)) {
            maior = b;
            if (a > c) {
                meio = a;
                menor = c;

            } else {
                meio = c;
                menor = a;
            }
            if ((c > a) && (c > b)) {
                maior = c;
                if (a > b) ;
                {
                    meio = a;
                    menor = b;
                }
            }else {
                    meio = b;
                    menor = a;

                }
            }
        System.out.println("A ordem decrescente é: " + maior + ", " + meio + ", " + menor);
        }}
