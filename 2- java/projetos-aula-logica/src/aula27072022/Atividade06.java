import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
         /*
        *Descrição: Escreva um algoritmo que lê dois valores booleanos (lógicos)
//                  e então determina se ambos são VERDADEIROS ou FALSOS.
//                  Obs:Faça uma pergunta por exemplo:
//                  Você é maior de idade?Responda SIM ou NAO.
//                  Atribua o valor conforme o caso e no final mostre a resposta:
//                  A pessoa é maior de idade, se a resposta for SIM
//                  A pessoa é menor de idade, se a resposta for NAO

          */
     String idade;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Voce e maior de idade?");
        idade= teclado.next();
        if (idade.equals("sim"))
            System.out.println("A pessoa e maior de idade "+idade+". ");
        else
        System.out.println("A pessoa nao e maior de idade.");

    }

}
