package src.ForWhile;

public class Exemplo_While {
    public static void main (String args[]){
        int count = 0;
        while(count <2){
            System.out.println("Repetição nr: +count");
            //nesse modo o código roda infinitamente
            count++; // com essa linha ele sai do looping
        }
    }
}
