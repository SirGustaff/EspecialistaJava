import java.util.Scanner;

public class Ds1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        int soma = 0;

        for (int i = 0; i < 10;) {

            int aux = input.nextInt();

            if(aux % 2 == 0) {

                soma += aux;

                i++;
                
            } else {

                System.out.println("Número inválido! Digite um número par");

            }

        }

        System.out.println("Soma dos numéros = " + soma);

        input.close();
        
    }
}