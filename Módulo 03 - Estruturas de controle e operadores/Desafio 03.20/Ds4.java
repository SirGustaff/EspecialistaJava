import java.util.Scanner;

public class Ds4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        int number = input.nextInt();

        String numeroInvertido = "";

        while (number != 0) {

            numeroInvertido += number % 10;

            number /= 10;

        }

        System.out.println(numeroInvertido);

        input.close();
        
    }
    
}