package Tarefa_ControleDeFluxo;

import java.util.Scanner;

public class Exercicio_Modulo10 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a nota do Primeiro Trimestre: ");
        int nota1 = s.nextInt();
        System.out.println("Digite a nota do Segundo Trimestre: ");
        int nota2 = s.nextInt();
        System.out.println("Digite a nota do Terceiro Trimestre: ");
        int nota3 = s.nextInt();
        System.out.println("Digite a nota do Quarto Trimestre ");
        int nota4 = s.nextInt();
        String media = getResultado((nota1+nota2+nota3+nota4)/4);
        System.out.println(media);
    }

    public static String getResultado(int resultado) {
        if (resultado >=0 && resultado <5) {
            return "Média: " + resultado + " - Reprovado";
        } else if (resultado >=5 && resultado <7) {
            return "Média: " + resultado + " - Recuperação";
        }else {
            return "Média: " + resultado + " - Aprovado";
        }
    }
}
