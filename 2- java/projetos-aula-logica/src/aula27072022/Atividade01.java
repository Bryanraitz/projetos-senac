import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int a,b,c;

        System.out.printf(" Escreva os valores de A e B");
        a= teclado.nextInt();
        b= teclado.nextInt();
        c= teclado.nextInt();

        if (a+b<c){
            System.out.println("a soma de A+B é menor que C");
        }
        if (a+b>c){
            System.out.println("a soma de A+B e maior que C");
        }
        if (a+b==c){
            System.out.println("a soma de A+B e igual a C");
        }

    }
}
