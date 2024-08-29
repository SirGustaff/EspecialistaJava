import java.util.Scanner;

public class Ds2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        System.out.print("Digite um número: ");

        int number = input.nextInt();

        checkEvenOdd(number);

        input.close();
        
    }

    public static void checkEvenOdd(int number) {

        int divisores = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0)
                divisores++;
            
        }

        if (divisores == 2)
            System.out.println("O número digitado é primo");

        else    
            System.out.println("O número digitado não é primo");

    }
}