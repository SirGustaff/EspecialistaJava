import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Programa Calculo IMC:\n");

        System.out.print("Digite seu peso e altura: ");

        Scanner input = new Scanner(System.in);

        float weight = input.nextFloat();

        float height = input.nextFloat();

        System.out.print("Você é homem ou mulher? (Digite H ou M): ");

        if (checkManWoman() == 'M') {

            checkImcWoman(height, weight);

        } else {

            checkImcMan(height, weight);
            
        }

        System.out.println("Fim do programa");
        
    }

    public static char checkManWoman () {

        Scanner input = new Scanner(System.in);

        char manWoman = input.next().charAt(0);

        while (manWoman != 'M' && manWoman != 'H') {

            System.out.println("Opcao invalida: Digite M para Mulher e H para Homem");

            System.out.print("Você é homem ou mulher?");

            manWoman = input.next().charAt(0);
            
        }

        return manWoman;

    }

    public static void checkImcWoman(float height, float weight) {

        float imc = weight / (height * height);

        if (imc < 19.1) 
            System.out.printf("Seu IMC é %.1f e você está abaixo do peso%n", imc);

        else if (imc >= 19.1 && imc <= 25.8)
            System.out.printf("Seu IMC é %.1f e você está no peso ideal%n", imc);

        else if (imc >= 25.9 && imc <= 27.3)
            System.out.printf("Seu IMC é %.1f e você está um pouco acima do peso%n", imc);

        else if (imc >= 27.4 && imc <= 32.3)   
            System.out.printf("Seu IMC é %.1f e você está acima do peso ideal%n", imc);

        else 
            System.out.printf("Seu IMC é %.1f e você está obeso%n", imc);

        return;

    }

    public static void checkImcMan(float height, float weight) {

        float imc = weight / (height * height);

        if (imc < 20.7) 
            System.out.printf("Seu IMC é %.1f e você está abaixo do peso%n", imc);

        else if (imc >= 20.8 && imc <= 26.4)
            System.out.printf("Seu IMC é %.1f e você está no peso ideal%n", imc);

        else if (imc >= 26.5 && imc <= 27.8)
            System.out.printf("Seu IMC é %.1f e você está um pouco acima do peso%n", imc);

        else if (imc >= 27.9 && imc <= 31.1)   
            System.out.printf("Seu IMC é %.1f e você está acima do peso ideal%n", imc);

        else 
            System.out.printf("Seu IMC é %.1f e você está obeso%n", imc);

        return;

    }

}