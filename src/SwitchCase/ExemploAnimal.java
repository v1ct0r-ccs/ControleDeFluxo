package src.SwitchCase;

import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digit o nome de um animal ");
        String texto = s.next();
        String animal = exampleOfSwitch(texto);
        System.out.println(animal);
    }

    public static String exampleOfSwitch(String animal) {
        String result;
        switch (animal) {
            case "Dog":
            case "Cat":
                result = "domestic animal";
                break;
            case "Tiger":
                result = "wild animal";
                break;
            default:
                result = "unknown animal";
                break;
        }
        return result;
    }
}
