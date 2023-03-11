package Tarefa_ControleDeFluxo;

import java.util.Scanner;

public class Exercicio_Modulo10 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a nota do Primeiro Trimestre: ");
        double nota1 = s.nextDouble();
        System.out.println("Digite a nota do Segundo Trimestre: ");
        double nota2 = s.nextDouble();
        System.out.println("Digite a nota do Terceiro Trimestre: ");
        double nota3 = s.nextDouble();
        System.out.println("Digite a nota do Quarto Trimestre ");
        double nota4 = s.nextDouble();
        String media = getResultado((nota1+nota2+nota3+nota4)/4);
        System.out.println(media);
    }

    public static String getResultado(double resultado) {
        if (resultado >=0.0 && resultado <5.0) {
            return "Média: " + resultado + " - Reprovado";
        } else if (resultado >=5.0 && resultado <7.0) {
            return "Média: " + resultado + " - Recuperação";
        }else {
            return "Média: " + resultado + " - Aprovado";
        }
    }
}
