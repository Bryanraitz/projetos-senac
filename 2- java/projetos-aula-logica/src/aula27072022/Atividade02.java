import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nome;
        String sexo;
        String estadocivil;

        System.out.println("Qual e seu nome?");
        nome= teclado.next();
        System.out.println("Qual seu sexo? M/F.");
        sexo= teclado.next();
        System.out.println("Qual seu estado civil?");
        estadocivil= teclado.next();
        System.out.println("Obrigado Aguardem...");

if (sexo.equals("F") && estadocivil.equals ("casada")) {
System.out.println("Há quanto tempo você está casada?");
int anos = teclado.nextInt();
    System.out.println("Você está casada há " + anos + " Anos! Parabéns ");


}

    }
}
