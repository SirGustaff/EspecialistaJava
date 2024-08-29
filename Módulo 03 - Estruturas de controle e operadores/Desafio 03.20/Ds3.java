import java.util.Scanner;

public class Ds3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        int soma = 0;

        while(soma < 100) {

            soma += input.nextInt();

        }

        System.out.println("Soma dos numeros: " + soma);

        input.close();
        
    }
    
}