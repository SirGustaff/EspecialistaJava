import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um ano: ");

        int year = input.nextInt();

        System.out.printf("O ano digitado é: %s%n", typeOfYear(year));

        input.close();
        
    }

    public static String typeOfYear (int year) {

        String type = "";

        type = year % 400 == 0 || year % 4 == 0 && year % 100 != 0? "Bissexto" : "Não bissexto" ;

        return type;

    }

}

    